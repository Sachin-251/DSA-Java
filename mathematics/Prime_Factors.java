package mathematics;

import java.util.Scanner;

public class Prime_Factors {

    //Naive Solution Time Complexity = O(nlogn)
    // public void primeFactors(int num){
    //     Check_Prime cp = new Check_Prime();
    //     for(int i=2;i<num;i++){
    //         if(cp.checkPrime(i)){
    //             int x=i;
    //             while(num%x==0){
    //                 System.out.print(i+" ");
    //                 x=x*i;
    //             }
    //         }
    //     }
    // }

    //Standard Soution Time Complexity = O(sqrt(n))
    // public void primeFactors(int num){
    //     if(num<=1) return;
    //     for(int i=2;i*i<=num;i++){
    //             while(num%i==0){
    //                 System.out.print(i+" ");
    //                 num=num/i;
    //             }
    //     }
    //     if(num>1) System.out.print(num);
    // }

    //Most Optimized Time Complexity = O(sqrt(n))
    public void primeFactors(int num){
        if(num<=1) return;
        while(num%2==0){
            System.out.print(2+" ");
            num=num/2;
        }
        while(num%3==0){
            System.out.print(3+" ");
            num=num/3;
        }
        for(int i=5;i*i<=num;i=i+6){
                while(num%i==0){
                    System.out.print(i+" ");
                    num=num/i;
                }
                while(num%(i+2)==0){
                    System.out.print((i+2)+" ");
                    num=num/(i+2);
                }
        }
        if(num>3) System.out.print(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        System.out.println("Prime Factors are: ");
        Prime_Factors pf = new Prime_Factors();
        pf.primeFactors(num);
        sc.close();
    }
}
