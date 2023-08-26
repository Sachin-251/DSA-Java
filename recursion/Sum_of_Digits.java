package recursion;

import java.util.Scanner;

public class Sum_of_Digits {
    //TC = O(N)
    public static int digitsSum(int n){
        if(n==0) return 0;
        return (n%10)+digitsSum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(digitsSum(num));
        sc.close();
    }
}
