package bitmagic;

import java.util.Scanner;

public class Check_Kth_Bit {
    //Naive Solution TC = O(N)
    // public static boolean isSet(int num, int k){
    //     int i=1;
    //     while(i<=k){
    //         if(i==k){
    //             if((num & 1) != 0) return true;
    //         }
    //         num=num/2;
    //         i++;    
    //     }
    //     return false;
    // }

    //Efiicient Solution 2 TC = O(1)
    // public static boolean isSet(int num, int k){
    //     int i=(num>>(k-1));
    //     if((i & 1) != 0)
    //         return true;
    //     else
    //         return false;
    // }

    //Efiicient Solution 1 TC = O(1) [STANDARD]
    public static boolean isSet(int num, int k){
        int i=(1<<(k-1));
        if((num & i) != 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,k;
        num=sc.nextInt();
        k=sc.nextInt();
        System.out.println(Check_Kth_Bit.isSet(num, k));
        sc.close();
    }
}
