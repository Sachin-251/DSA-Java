package recursion;

import java.util.Scanner;

public class N_NaturalNum_Sum {
    //General Formula = n*(n+1)/2. TC= O(N)
    public static int sum(int num){
        if(num==0) return 0;

        return num+sum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sum(num));
        sc.close();
    }
}
