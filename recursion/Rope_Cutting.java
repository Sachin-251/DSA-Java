package recursion;

import java.util.Scanner;

public class Rope_Cutting {
    //TC = O(3^N)
    public static int ropeCut(int n, int a, int b, int c){
        if(n==0) return 0;
        if(n<0) return -1;
        int res = Math.max(Math.max(ropeCut(n-a, a, b, c),
                            ropeCut(n-b, a, b, c)),
                            ropeCut(n-c, a, b, c));
        
        if(res==-1) return -1;
        return res+1;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n,a,b,c;
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println(ropeCut(n, a, b, c));
        sc.close();
    }
}
