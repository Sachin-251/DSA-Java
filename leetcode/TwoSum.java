package leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //Naive Solution TC = O(N^2)
    // public static int[] twoSum(int[] nums, int target){
    //     for(int i = 0; i < nums.length-1; i++){
    //         for(int j=i+1; j < nums.length; j++){
    //             if((nums[i] + nums[j]) == target){
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    //     return new int[]{};
    // }

    //Optimized Solution
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n ; i++){
            numMap.put(nums[i], i);
        }

        for(int i=0; i<n; i++){
            int complement = target - nums[i];
            if(numMap.containsKey(complement) && numMap.get(complement) != i){
                return new int[]{i, numMap.get(complement)};
            }
        }
        
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
