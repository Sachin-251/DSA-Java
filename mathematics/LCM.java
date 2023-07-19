package mathematics;
import java.util.Scanner;

import mathematics.GCD;

public class LCM {
    public int calc_lcm(int a, int b){
        GCD gcd = new GCD();
        return (a*b)/gcd.calc_gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        LCM lcm = new LCM();
        System.out.println("The LCM is: "+lcm.calc_lcm(a, b));
        sc.close();
    }
}
