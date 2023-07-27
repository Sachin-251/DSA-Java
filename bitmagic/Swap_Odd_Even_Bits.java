package bitmagic;

import java.util.Scanner;

public class Swap_Odd_Even_Bits {
    //TC = O(1)
    public static int swapBits(int n) 
    {
	    int even = n & 0xAAAAAAAA;
	    int odd = n & 0x55555555;
	    even = even>>1;
	    odd = odd<<1;
	    return (even | odd);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.println(swapBits(num));
        sc.close();
    }
}
