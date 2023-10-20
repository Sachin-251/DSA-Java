package leetcodeEasy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    // static int value(char r){
    //     if(r == 'I') return 1;
    //     if(r == 'V') return 5;
    //     if(r == 'X') return 10;
    //     if(r == 'L') return 50;
    //     if(r == 'C') return 100;
    //     if(r == 'D') return 500;
    //     if(r == 'M') return 1000;
    //     return -1;
    // }

    // public static int romanToInt(String s) {
    //     int res = 0;
    //     for(int i = 0; i < s.length(); i++){
    //         int s1 = value(s.charAt(i));
    //         if(i+1 < s.length()){
    //             int s2 = value(s.charAt(i+1));
    //             if(s1 >= s2){
    //                 res = res + s1;
    //             } else{
    //                 res = res + (s2 - s1);
    //                 i++;
    //             }
    //         } else{
    //             res = res + s1;
    //         }
    //     }
    //     return res;
    // }

    //Using MAP
    public static int romanToInt(String s){
        int res = 0;
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        for(int i = 0; i< s.length(); i++){
            if(i < s.length()-1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
                res = res - m.get(s.charAt(i));
            } else{
                res = res + m.get(s.charAt(i));
            }
        }
                
        return res;
    }

    public static void main(String[] args) {
        String s = "XLVIII";
        System.out.println(romanToInt(s));
    }
}
