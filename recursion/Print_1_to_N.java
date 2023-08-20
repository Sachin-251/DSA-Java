package recursion;

import java.util.Scanner;

public class Print_1_to_N {
    //TC = O(N)
    // public static void print1ToN(int num){
    //     if(num==0) return;
    //     print1ToN(num-1);
    //     System.out.print(num+" ");
    // }

    //Tail Recursive
    public static void print1ToN(int num, int k){
        if(num==0) return;
        System.out.print(k+" ");
        print1ToN(num-1,k+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        // print1ToN(num);
        print1ToN(num,1);
        sc.close();
    }
}
