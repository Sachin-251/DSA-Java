package accenture_leetcode;

public class Remove_Vowels {

    static String removeVowels(String str){
        char[] arr = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            char ch = arr[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                continue;
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(removeVowels(str));
    }
}
