package Opgaver;

public class Opgave05 {
    public static void main(String[] args) {
        System.out.println("Mønster A");
        patternA();
        System.out.println("Mønster B");
        patternB();
        System.out.println("Mønster C");
        patternC();
        System.out.println("Mønster D");
        patternD();

    }
    public static void patternA(){
        int i=1;
        while (i<=5) {
            int j=1;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void patternB(){
        int i=5;
        while (i>=1) {
            int j=1;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
    public static void patternC(){
        int i=1;
        while (i<=5) {
            int space=1;
            while (space<=5-i) {
                System.out.print(" ");
                space++;
            }
                int j = 1;
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i++;
            }
        }

    public static void patternD(){
        int i=5;
        while (i>=1) {
            int space=5-i;
            while (space>=1) {
                System.out.print(" ");
                space--;
            }
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    }

