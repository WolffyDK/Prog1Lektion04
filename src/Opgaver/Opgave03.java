package Opgaver;

import java.util.Scanner;

public class Opgave03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast et tal du vil have tabel på: ");
        int in = input.nextInt();
        lilleTabel(in);
        System.out.println("Her er den store tabel");
        storTabel();
    }

    public static void lilleTabel(int tal) {
        System.out.println(tal);
        int i=1;
        while (i<10) {
            i++;
            System.out.println(tal*i);
        }
    }
    public static void storTabel() {
        int r = 1;
        while (r <= 10) {
            int k = 1;
            while (k <= 10) {
                System.out.print((r * k ) + "\t");
                k++;
            }
            System.out.println();
            r++;
        }
    }
}
