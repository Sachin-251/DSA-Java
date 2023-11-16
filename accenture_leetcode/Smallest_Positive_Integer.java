package accenture_leetcode;

import java.util.Arrays;

public class Smallest_Positive_Integer {

    static int smallestInteger(int[] arr){
        int smallest = 1;
       Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                if(arr[i] == smallest) smallest++;
            }
        }

        return smallest;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,-1,-3,0,6,5,7,1};
        System.out.println("Missing smallest positive integer: "+smallestInteger(arr));
    }
}
