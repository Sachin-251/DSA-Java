package mathematics;

import java.util.Scanner;
//Time Complexity = O(n)
public class Factorial {
    //Recursive
    public long recFact(long num){
        if(num==0){
            return 1;
        }
        return num*recFact(num-1);
    }
    //Iterative
    public int fact(int num){
        int res=1;
        if(num==0){
            return 1;
        }
        for(int i=num;i>0;i--){
            res = res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        Factorial f = new Factorial();
        System.out.println("Factorial: "+f.recFact(num));
    }
}
