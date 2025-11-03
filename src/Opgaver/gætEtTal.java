package Opgaver;

import java.util.Scanner;
import java.util.Random;

public class gætEtTal {
    public static void main(String[] args) {
        gætEtTal();
    }

    public static void gætEtTal() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        //Bruger input
        System.out.println("Jeg har valgt et tal mellem 1-50");
        System.out.print("Gæt et tal:");
        int brugerGæt = input.nextInt();

        int hemmeligtTal = random.nextInt(50) + 1;
        int forsøg=1;
        while (brugerGæt != hemmeligtTal) {
            if (brugerGæt < hemmeligtTal) {
                System.out.println("For lavt! ");
                System.out.print("Gæt igen:");
            } else if (brugerGæt > hemmeligtTal) {
                System.out.println("For højt!");
                System.out.print("Gæt igen:");

            }
            brugerGæt = input.nextInt();
            forsøg++;
        }
        System.out.println("Tillykke du gættede rigtigt!");
        System.out.print("Du brugte " +forsøg + " forsøg");
    }
}
