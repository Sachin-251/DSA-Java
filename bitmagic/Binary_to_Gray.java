package bitmagic;

import java.util.Scanner;

public class Binary_to_Gray {
    //TC = O(1)
    public static int greyConverter(int n) {
        return (n^(n>>1));   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.println(greyConverter(num));
        sc.close();
    }
}
