package mathematics;

import java.util.Scanner;

public class Absolute_Value {
    public int absolute(int num){
        if(num<0){
            return -1 * num;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        Absolute_Value av=new Absolute_Value();
        System.out.println("Absolute value: "+av.absolute(num));
        sc.close();
    }
}
