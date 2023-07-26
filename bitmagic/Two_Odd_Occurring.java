package bitmagic;

public class Two_Odd_Occurring {

    //TC = O(N)
    public static void checkTwoOdd(int[] arr){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=res^arr[i];
        }
        int k = (res & (~(res-1)));
        int res1=0,res2=0;
        for(int i =0;i<arr.length;i++){
            if((arr[i] & k)!=0)
                res1=res1^arr[i];
            else{
                res2=res2^arr[i];
            } 
        }
        System.out.println(res1+" "+res2);
    }
    public static void main(String[] args) {
        int arr[] = {4,3,4,4,4,5,5,3,3,3,4,3};
        Two_Odd_Occurring.checkTwoOdd(arr);
    }
}
