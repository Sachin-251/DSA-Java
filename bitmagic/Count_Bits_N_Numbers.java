package bitmagic;

import java.util.Scanner;

public class Count_Bits_N_Numbers {
    //TC = O(log N)
    static int largestPower(int n){
        int x=0;
        while((1<<x)<=n)
            x++;
        return x-1;
    }
    public static int countSetBits(int n){
        if(n<=1) return n;
        int x = largestPower(n);
        return (x * (int)Math.pow(2,(x-1)))+(n - (int)Math.pow(2,x) + 1)
            +countSetBits(n-(int)Math.pow(2,x));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.println(countSetBits(num));
        sc.close();
    }
}
