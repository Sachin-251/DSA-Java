package mathematics;

import java.util.Scanner;

public class Modular_Multiplicative_Inverse {
    public static int modInverse(int a, int m)
    {
      //Your code here
      GCD gcd = new GCD();
      if(gcd.calc_gcd(a,m)!=1) return -1;
      for(int i=1;i<m;i++){
          if((a*i)%m==1) return i;
      }
      return -1;
    }
    public static void main(String[] args) {
        int a,m;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        m=sc.nextInt();
        System.out.println(modInverse(a,m));
        sc.close();
    }
}
