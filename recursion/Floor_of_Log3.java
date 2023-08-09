package recursion;

import java.util.Scanner;

public class Floor_of_Log3 {
    public static int log3(int num){
        if(num<3) return 0;
        return 1 + log3(num/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(log3(num));
        sc.close();
    }
}
