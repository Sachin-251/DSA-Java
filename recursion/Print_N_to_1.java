package recursion;

import java.util.Scanner;

public class Print_N_to_1 {
    //TC = O(N)
    public static void printRev(int num){
        if(num==0) return;
        System.out.print(num+" ");
        printRev(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        printRev(num);
        sc.close();
    }
}
