package mathematics;

import java.util.ArrayList;
import java.util.Scanner;

public class Quadratic_Equation_Roots {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> arr = new ArrayList();
        int first,second;
        int det = (b*b)-(4*a*c);
        if(det<0){
            arr.add(-1);
        }else{
            first=(int)Math.floor((-1*b + Math.sqrt(det))/(2*a));
            second=(int)Math.floor((-1*b - Math.sqrt(det))/(2*a));
            arr.add(Math.max(first,second));
            arr.add(Math.min(first,second));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        Quadratic_Equation_Roots qer = new Quadratic_Equation_Roots();
        ArrayList<Integer> roots = new ArrayList();
        roots = qer.quadraticRoots(a, b, c);
        if(roots.size()==1){
            System.out.println("Imaginary");
        }else
            System.out.println(roots);
        sc.close();
    }
}
