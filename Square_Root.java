import java.util.*;

class Square_Root{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:\t");
        num=sc.nextInt();
        if(num==0 || num==1){
            System.out.println("Square root is:\t"+num);
        }else{
            int i=0;
            int res=0;
            while(res<num){
                i++;
                res=i*i;
            }
            System.out.println("Square root is:\t"+i);
        }
        sc.close();
    }
}