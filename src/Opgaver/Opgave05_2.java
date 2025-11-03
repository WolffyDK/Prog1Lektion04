package Opgaver;

public class Opgave05_2 {
    public static void main(String[] args) {
        moensterA();

    }
    public static void moensterA(){
        int i=1;
        while (i<=5){
            int j=1;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
