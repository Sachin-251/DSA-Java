package mathematics;

import java.util.Scanner;
//Time Complexity = O(n)
class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number:\t");
        num=sc.nextInt();
        Count c = new Count(num);
        sc.close();
    }    
}

class Count{
    public Count(int num){
        int count=0;
        while(num > 0){
            num=num/10;
            count++;
        }
        System.out.println("Digits: "+count);
    }
}