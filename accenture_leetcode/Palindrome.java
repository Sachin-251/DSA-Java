package accenture_leetcode;

public class Palindrome {

    static boolean checkPalindrome(String str){
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = str.toCharArray();
        for (int i = arr.length-1; i >= 0; i--) {
            stringBuilder.append(arr[i]);
        }
        String revStr = stringBuilder.toString();
        
        if(str.equals(revStr)) return true;

        return false;
    }
    public static void main(String[] args) {
        String str = "abccba";
        if(checkPalindrome(str)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
