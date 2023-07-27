package bitmagic;

import java.util.Scanner;

public class Longest_Consecutive_Ones {
    public static int maxConsecutiveOnes(int N) {
        int count=0;
        while(N>0){
            N = N & (N<<1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.println(maxConsecutiveOnes(num));
        sc.close();
    }
}
