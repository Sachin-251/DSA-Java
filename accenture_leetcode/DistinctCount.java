package accenture_leetcode;

import java.util.ArrayList;

public class DistinctCount {

    static void distinctCount(int[] arr1, int[] arr2, int[] arr3){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len3 = arr3.length;
        int count1 = 0, count2 =0, count3 = 0;

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < len1; i++) {
            list1.add(arr1[i]);
        }
        for (int i = 0; i < len2; i++) {
            list2.add(arr2[i]);
        }
        for (int i = 0; i < len3; i++) {
            list3.add(arr3[i]);
        }

        // System.out.println(list1+"\n"+list2+"\n"+list3);

        for (int i = 0; i < len1; i++) {
            if(!list2.contains(list1.get(i))){
                if(!list3.contains(list1.get(i))){
                    count1++;
                }
            }
        }

        for (int i = 0; i < len2; i++) {
            if(!list1.contains(list2.get(i))){
                if(!list3.contains(list2.get(i))){
                    count2++;
                }
            }
        }

        for (int i = 0; i < len3; i++) {
            if(!list2.contains(list3.get(i))){
                if(!list1.contains(list3.get(i))){
                    count3++;
                }
            }
        }

        
        System.out.println("Distinct Elements in Array 1: "+count1);
        System.out.println("Distinct Elements in Array 2: "+count2);
        System.out.println("Distinct Elements in Array 3: "+count3);
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,5,7,9};
        int[] arr2 = new int[]{1,2,3,4,5};
        int[] arr3 = new int[]{2,4,6,8};
        distinctCount(arr1, arr2, arr3);
    }
}
