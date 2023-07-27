package bitmagic;

import java.util.Scanner;

public class Check_Sparse {

    public static boolean isSparse(int n)
    {
        return ((n & (n<<1))==0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.println(isSparse(num));
        sc.close();
    }
}
