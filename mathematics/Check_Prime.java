package mathematics;

import java.util.Scanner;

public class Check_Prime {
    // NAIVE Time Complexity = O(n)
    // public boolean checkPrime(int num){
    //     if(num==1) return false;
    //     for(int i=num/2;i>1;i--){
    //         if(num%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //Time Complexity = O(sqrt(n))
    // public boolean checkPrime(int num){
    //     if(num==1) return false;
    //     for(int i=2;i*i<=num;i++){
    //         if(num%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //Most Optimized
    public boolean checkPrime(int num){
        if(num==1) return false;
        if(num==2 || num==3) return true;
        if(num%2==0 || num%3==0) return false;
        for(int i=5;i*i<=num;i=i+6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        Check_Prime cp = new Check_Prime();
        System.out.println(cp.checkPrime(num));
        sc.close();
    }
}
