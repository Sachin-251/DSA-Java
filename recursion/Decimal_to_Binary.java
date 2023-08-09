package recursion;

import java.util.Scanner;

public class Decimal_to_Binary {
    public static void decToBin(int num){
        if(num==0) return;
        decToBin(num/2);
        System.out.print((num%2)+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        decToBin(num);
        sc.close();
    }
}
