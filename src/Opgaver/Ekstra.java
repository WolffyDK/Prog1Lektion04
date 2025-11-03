package Opgaver;
import java.util.Scanner;
public class Ekstra {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Indtast et tal og se om det er ulige eller lige: ");
        int brugerTal=input.nextInt();
        ligeEllerUlige(brugerTal);
        System.out.println("Svar på om tallene op til dit tal er ulige eller lige");

        int uligeTaeller=0;
        int ligeTaeller=0;

        int i=1;
        while (i<=brugerTal){
            ligeEllerUlige(i);
            if (i%2==0){
                ligeTaeller++;
            } else{
                uligeTaeller++;
            }
            i++;
        }
        System.out.println("Antal lige tal:"+ligeTaeller);
        System.out.println("Antal ulige tal:"+uligeTaeller);
    }
    public static void ligeEllerUlige(int tal) {
        if (tal % 2 == 0) {
            System.out.println(tal+" er et lige tal");
        }
        else{
            System.out.println(tal+" er et uligetal");
        }
    }
}
