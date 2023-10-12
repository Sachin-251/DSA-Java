package recursion;

import java.util.Scanner;

public class Tower_of_Hanoi {
    //TC = O(2^N)
    public static void toh(int n, char a, char b, char c){
        if(n==1){
            System.out.println("Move disk 1 from "+a+" to "+c);
            return;
        }
        toh(n-1, a, c, b);
        System.out.println("Move disk "+n+" from "+a+" to "+c);
        toh(n-1, b, a, c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        toh(n, 'A', 'B', 'C');
        sc.close();
    }
}
