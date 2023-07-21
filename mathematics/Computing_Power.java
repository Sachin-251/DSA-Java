package mathematics;

import java.util.Scanner;

public class Computing_Power {

    //Naive Approach Time Complexity = O(n)
    // public int calcPower(int num, int exponent){
    //     if(num==1) return 1;
    //     int res=1;
    //     for(int i=1;i<=exponent;i++){
    //         res = res*num;
    //     }
    //     return res;
    // }

    //Efficient Approach Time Complexity = O(logn), Space = O(logn)
    // public int calcPower(int num, int exponent){
    //     if(exponent==0) return 1;
    //     int temp=calcPower(num, exponent/2);
    //     temp=temp*temp;
    //     if(exponent%2==0){
    //         return temp;
    //     }else{
    //         return temp * num;
    //     }
    // }

    //Most Efficient Approach Time Complexity = O(logn), Space = O(1)
    public int calcPower(int num, int exponent){
        if(exponent==0) return 1;
        int res=1;
        while(exponent > 0){
            if(exponent%2!=0){
                res=res*num;
            }
            num=num*num;
            exponent=exponent/2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, exponent;
        System.out.println("Enter the number and Exponent: ");
        num=sc.nextInt();
        exponent = sc.nextInt();
        Computing_Power power = new Computing_Power();
        System.out.println("The result is: "+power.calcPower(num, exponent));
        sc.close();
    }
}
