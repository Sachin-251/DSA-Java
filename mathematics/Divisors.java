package mathematics;

import java.util.Scanner;

public class Divisors {
    // Time Complexity = O(n)
    // public void divisors(int num){
    //     for(int i=1;i<=num/2;i++){
    //         if(num%i==0){
    //             System.out.print(i+" ");
    //         }
    //     }
    //     System.out.print(num+" ");
    // }

    //Time Complexity = O(sqrt(n))
    public void divisors(int num){
        int i;
        for(i=1;i*i<num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        for(;i>=1;i--){
            if(num%i==0){
                System.out.print((num/i)+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        System.out.println("Divisors are: ");
        Divisors div = new Divisors();
        div.divisors(num);
        sc.close();
    }
}
