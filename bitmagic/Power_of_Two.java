package bitmagic;

import java.util.Scanner;

public class Power_of_Two {
    //Naive Approach TC = O(log N)
    // public static boolean checkPower(int num){
    //     if(num==0) return false;
    //     while(num!=1){
    //         if(num%2!=0) return false;
    //         num=num/2;
    //     }
    //     return true;
    // }

    //Using Brian Kenrningum's Algorithm TC = O(1)
    public static boolean checkPower(int num){
        if(num==0) return false;
        return ((num & (num-1))==0); // for removing above line use - return (num && ((num & (num-1))==0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.println(Power_of_Two.checkPower(num));
        sc.close();
    }
}
