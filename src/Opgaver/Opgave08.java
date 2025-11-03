package Opgaver;

import java.util.Scanner;

public class Opgave08 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //Får brugeren til at tast et tal for at se om det er et pallidrom
        System.out.print("Indtast et tal, for at se om det er et pallidrom:");
        int brugerTal=input.nextInt();
        boolean resultat=isPallidrom(brugerTal);
        System.out.println("Er tallet et pollidrom: "+resultat);
    }
    public static boolean isPallidrom(int number) {
        int orginal=number;
        int reversed=0;
        while (number>0){
            int ciffer=number%10;
            reversed=reversed*10+ciffer;
            number/=10;
        }
        if (orginal==reversed) {
            return true;
        } else {
            return false;
        }
    }
}
