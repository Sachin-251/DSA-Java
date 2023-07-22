package mathematics;

import java.util.Scanner;

public class Trail_Fact_Zero {
    //#########  NAIVE APPRAOCH ########## 
    // public long fact(long num){
    //     long res=1;
    //     if(num==0){
    //         return 1;
    //     }
    //     for(int i=1;i<=num;i++){
    //         res = res*i;
    //     }
    //     return res;
    // }
    
    // public int zeros(int num){
    //     int res=0;
    //     long rem;
    //     long fact = fact(num);
    //     while(fact > 0){
    //         rem=fact%10;
    //         fact=fact/10;
    //         if(rem==0){
    //             res++;
    //         }else{
    //             return res;
    //         }
    //     }
    //     return res;
    // }

    //EFFICIENT APPROACH
    //Time Complexity = O(log n)
    public int trailZeros(int num){
        int res=0;
        for(int i=5;i<=num;i=i*5){
            res=res+(num/i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        Trail_Fact_Zero tfz = new Trail_Fact_Zero();
        System.out.println("Zeros: "+tfz.trailZeros(num));
        sc.close();
    }
}
