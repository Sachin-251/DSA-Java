package recursion;

import java.util.Scanner;

public class Floor_of_Log2 {
    public static int log2(int num){
        if(num==1) return 0;
        return 1+log2(num/2);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(log2(num));
        sc.close();
    }
}
