package bitmagic;

import java.util.Scanner;

public class Gray_to_Binary {
    //TC = O(log N)
    public static int grayToBinary(int n) {
        int res=n;
        while(n>0){
            n = n>>1;
            res = res^n;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.println(grayToBinary(num));
        sc.close();
    }
}
