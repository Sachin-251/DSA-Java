package mathematics;

import java.util.Scanner;

public class Multiplication_Under_Modulo {
    static long multiplicationUnderModulo(long a, long b)
    {
        // add your code here
        long m = 1000000007;
        return ((a%m)*(b%m))%m;
    }
    public static void main(String[] args) {
        long a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextLong();
        b=sc.nextLong();
        System.out.println(multiplicationUnderModulo(a, b));
        sc.close();
    }
}
