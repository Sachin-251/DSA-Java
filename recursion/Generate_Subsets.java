package recursion;

import java.util.Scanner;

public class Generate_Subsets {
    //2^N subsets, can also be used for subsequences
    public static void subsets(String str, String curr, int i){
        if(i==str.length()){
            System.out.println("["+curr+"]");
            return;
        }
        subsets(str, curr, i+1);
        subsets(str, curr+str.charAt(i), i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        subsets(str, "", 0);
        sc.close();
    }
}
