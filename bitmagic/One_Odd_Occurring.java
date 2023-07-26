package bitmagic;

public class One_Odd_Occurring {
    //Naive Approach TC = O(N^2)
    // public static int checkOdd(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         int count=0;
    //         for(int j=0;j<arr.length;j++){
    //             if(arr[i]==arr[j]) count++;
    //         }
    //         if(count%2!=0) return arr[i];
    //     }
    //     return -1;
    // }

    //Efficient Approach TC = O(N)
     public static int checkOdd(int[] arr){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=res^arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,4,4,4,5,5,3,3,3,4};
        System.out.print(One_Odd_Occurring.checkOdd(arr));
    }
}
