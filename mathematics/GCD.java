package mathematics;

import java.util.Scanner;

public class GCD {
    public int calc_gcd(int a, int b){
        if(a==0) return b;
        return calc_gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        GCD gcd = new GCD();
        System.out.println("The GCD is: "+gcd.calc_gcd(a, b));
        sc.close();
    }
}
