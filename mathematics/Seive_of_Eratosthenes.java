package mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class Seive_of_Eratosthenes{

    //Naive Approach Time Complexity = O(n sqrt(n))
    // public void seive(int num){
    //     if(num<=1) return;
    //     Check_Prime cp = new Check_Prime();
    //     for(int i=2;i<=num;i++){
    //         if(cp.checkPrime(i)){
    //             System.out.print(i+" ");
    //         }
    //     }
    // }

    //Efficient Approach Time Complexity = O(n log logn)
    public void seive(int num){
        if(num<=1) return;
        boolean isPrime[] = new boolean[num+1];
        Arrays.fill(isPrime, true);
        for(int i=2;i*i<=num;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=num;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=2;i<=num;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        System.out.println("Prime's are: ");
        Seive_of_Eratosthenes soe = new Seive_of_Eratosthenes();
        soe.seive(num);
        sc.close();
    }
}