package Opgaver;
import java.util.Scanner;
public class Opgave07 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //Scanner der får brugeren til at give tal at reverse
        System.out.print("Indtast et tal du vil reverse:");
        int brugerTal=input.nextInt();
        System.out.println("Dit nye tal er:"+reverse(brugerTal));
    }
    public static int reverse(int tal){
        int reversed=0;
        while (tal>0){
            int ciffer=tal%10;
            reversed=reversed*10+ciffer;
            tal/=10;
        }
        return reversed;
    }
}
