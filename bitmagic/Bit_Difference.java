package bitmagic;

import java.util.Scanner;

public class Bit_Difference {
    public static int countBitsFlip(int a, int b){
        int res = a^b;
        int count=0;
        while(res>0){
            res=(res & (res-1));
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(countBitsFlip(a, b));
        sc.close();
    }
}
