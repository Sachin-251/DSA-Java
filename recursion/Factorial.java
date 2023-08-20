package recursion;

import java.util.Scanner;

public class Factorial {
    // public static int fact(int num){
    //     if(num==0 || num==1) return 1;
    //     return num*fact(num-1);
    // }
    
    //Tail Recursive
    public static int fact(int num,int k){
        if(num==0 || num==1) return k;
        return fact(num-1,k*num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        // System.out.println(fact(num));
        System.out.println(fact(num,1));
        sc.close();
    }
}
