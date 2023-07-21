package mathematics;

import java.util.Scanner;

public class Celsius_to_Farenheit {
    public int cToF(int cel){
        return (cel*9/5)+32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cel;
        System.out.println("Enter the Celcius: ");
        cel=sc.nextInt();
        Celsius_to_Farenheit ctf = new Celsius_to_Farenheit();
        System.out.println("Farenheit: "+ctf.cToF(cel));
        sc.close();
    }
}
