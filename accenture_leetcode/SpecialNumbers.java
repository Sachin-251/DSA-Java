package accenture_leetcode;

public class SpecialNumbers {
    public static int desiredArray(int[] arr, int n, int k){
        int count = 0;
        int res= 0, num = 0, flag;
        while(count<k){
            num++;
            flag = 1;
            for(int i=0; i<n; i++){
                if(num%arr[i] == 0 ){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                res = res + num;
                System.out.print(num+" ");
                count++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,6,9,12};
        int n = arr.length;
        int k = 4;
        System.out.println("\n"+desiredArray(arr, n, k));
    }
}
