package bitmagic;

public class Maximum_AND_Value {
    public static int maxAND (int arr[], int N) {
        int res=0;
        for(int bit=31;bit>=0;bit--){
            int count=0,cVal = (res | (1<<bit));
            for(int i=0;i<N;i++){
                if((cVal&arr[i])==cVal) count++;
            }
            if(count>=2) res=res | (1<<bit);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {4,8,12,16};
        System.out.println(maxAND(arr, arr.length));
    }
}
