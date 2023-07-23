package mathematics;

import java.util.Scanner;

public class Addition_Under_Modulo {
    public static long sumUnderModulo(long a, long b){
        // code here
        long i=0;
        long m = 1000000007;
        i = ((a%m)+(b%m))%m;
        return i;
    }
    public static void main(String[] args) {
        long a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextLong();
        b=sc.nextLong();
        System.out.println(sumUnderModulo(a, b));
        sc.close();
    }  
}
