package Opgaver;

public class opgave03_2 {
    public static void main(String[] args) {
        mønsterA();
        mønsterB();
    }
    public static void mønsterA (){
        System.out.println("Mønster A:");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void mønsterB (){
        System.out.println("Mønster B:");
        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
