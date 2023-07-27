package bitmagic;

import java.util.Scanner;

public class Rightmost_Different_Bit {
    ////TC = O(max(log M,log N))
    public static int posOfRightMostDiffBit(int m, int n)
    {  
        int res = m^n;
        int count=0;
        while(res>0){
            count++;
            if((res&1)!=0) return count;
            res=res/2;
        }
        return -1;     
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println(posOfRightMostDiffBit(m, n));
        sc.close();
    }
}
