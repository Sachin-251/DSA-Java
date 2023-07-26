package bitmagic;

import java.util.Scanner;

public class Count_Set_Bits {
    //Naive Approach TC = O(N)
    // public int countSetBits(int num){
    //     int count=0;
    //     while(num>0){
    //         if((num & 1)!=0) count++; // count = count + (num & 1);
    //         num=num/2;
    //     }
    //     return count;
    // }

    //Brian Kenrningum's Algorithm TC = O(Set Bits)
    public int countSetBits(int num){
        int count=0;
        while(num>0){
            num= num & (num-1);
            count++;
        }
        return count;
    }

    //Lookup Table Approach
    // int tbl[] = new int[256];
    // public void initialize(){
    //     tbl[0]=0;
    //     for(int i=1;i<256;i++){
    //         tbl[i] = tbl[i&(i-1)] + 1;
    //     }
    // }
    // public int countSetBits(int num){
    //     return tbl[num & 255] + tbl[(num>>8) & 255] + tbl[(num>>16) & 255] + tbl[(num>>24) & 255];
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        Count_Set_Bits csb = new Count_Set_Bits();
        //csb.initialize();
        System.out.println(csb.countSetBits(num));
        sc.close();
    }
}
