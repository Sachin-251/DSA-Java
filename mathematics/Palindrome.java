package mathematics;

import java.util.Scanner;

public class Palindrome {
    //Time Complexity = O(n)
    public boolean checkPalindrome(int num){
        int temp = num;
        int rem, rev = 0;
        while(temp > 0){
            rem = temp%10;
            rev = rev*10 + rem;
            temp=temp/10;
        }
        if(rev == num) return true;
        else return false;
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        Palindrome pal = new Palindrome();
        if(pal.checkPalindrome(num)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
    
}
