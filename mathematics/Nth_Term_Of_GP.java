package mathematics;

import java.util.Scanner;

public class Nth_Term_Of_GP {
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        if(N==1) return A;
        if(N==2) return B;
        double R = (double)B/A;
        //System.out.println(R);
        double term = A*Math.pow(R,N-1);
        return term;
    }
    public static void main(String[] args) {
        int A,B,N;
        Scanner sc = new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        N=sc.nextInt();
        Nth_Term_Of_GP ntg = new Nth_Term_Of_GP();
        System.out.println(Math.floor(ntg.termOfGP(A,B,N)));
        sc.close();
    }
}
