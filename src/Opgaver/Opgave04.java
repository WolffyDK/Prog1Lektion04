package Opgaver;

import java.util.Scanner;

public class Opgave04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast det 1 tal:");
        int base= input.nextInt();
        System.out.print("Indtast det 2 tal:");
        int iAnden= input.nextInt();

        int result =power(base,iAnden);
        System.out.print("Resultatet er: "+result);

    }
    public static int power (int base, int exponent) {
        int result = 1;
        int i = 0;
        while (i<exponent) {
            result=result*base;
            i++;
        }
        return result;
    }
}
