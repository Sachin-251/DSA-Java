package bitmagic;

public class Powerset_Using_Bitwise {
    //TC = O(2^N * N)
    public static void powerSet(String str){
        int n = str.length();
        int pSize = (1<<n);
        for(int i=0;i<pSize;i++){
            System.out.print("[");
            for(int j=0;j<n;j++){
                if((i & (1<<j)) != 0) System.out.print(str.toCharArray()[j]);
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        Powerset_Using_Bitwise.powerSet(str);
    }
}
