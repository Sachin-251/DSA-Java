package mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class Divisor_of_Three {
    //Time Complexity = O(N*log(log(N)))
    // public int exactly3Divisors(int N)
    // {
    //     boolean isPrime[] = new boolean[N+1];
    //     Arrays.fill(isPrime, true);
    //     isPrime[0]=isPrime[1]=false;
    //     for(int i=2;i*i<=N;i++){
    //         if(isPrime[i]){
    //             for(int j=i*i;j<=N;j=j+i){
    //                 isPrime[j]=false;
    //             }
    //         }
    //     }
    //     int count=0;
    //     for(int i=0;i*i<=N;i++){
    //         //System.out.println(isPrime[i]);
    //         if(isPrime[i]) count++;
    //     }
    //     return count;
    // }

    //Optimized Solution Time Complexity = O(sqrt(N^2))
    public int exactly3Divisors(int N)
    {
        int count=0;
        Check_Prime cp=new Check_Prime();
        for(int i=2;i*i<=N;i++){
            if(cp.checkPrime(i))
                if(i*i<=N) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        Divisor_of_Three dot = new Divisor_of_Three();
        System.out.println(dot.exactly3Divisors(num));
        sc.close();
    }
}
