package mathematics;

import java.util.Scanner;

public class Count_Digits_Factorial {

    //Naive Approach
    // public int digitsInFactorial(int num){
    //     if(num<0) return 0;
    //     if(num<=1) return 1;
    //     Factorial fact = new Factorial();
    //     long factorial = fact.recFact(num);
    //     int count=0;
    //     while(factorial>0){
    //         count++;
    //         factorial=factorial/10;
    //     }
    //     return count;
    // }

    //Efficient Time Complexity = O(N log N)
    // public int digitsInFactorial(int num){
    //     if(num<0) return 0;
    //     if(num<=1) return 1;
    //     double digits=0;
    //     for(int i=2;i<=num;i++){
    //         digits += Math.log10(i);
    //     }
    //     return (int)(Math.floor(digits))+1;
    // }
    
    //Most Efficient (Stirling's Approximation) Time Complexity = O(1)
    public int digitsInFactorial(int N){
        if(N<0) return 0;
        if(N<=1) return 1;
        
        double digits=(N*Math.log10(N/Math.E)+Math.log10(2*Math.PI*N)/2.0);
        return (int)Math.floor(digits)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        Count_Digits_Factorial cdf = new Count_Digits_Factorial();
        System.out.println("Number of digits: "+cdf.digitsInFactorial(num));
        sc.close();
    }

}
