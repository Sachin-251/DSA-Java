package bitmagic;

import java.util.Scanner;

public class First_Set_Bit {
    public static int getFirstSetBit(int n){
        int pos =1;
        while(n>0){
            if(n%2!=0) return pos;
            pos++;
            n=n/2;
        }
        return 0;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.println(getFirstSetBit(num));
        sc.close();
    }
}
