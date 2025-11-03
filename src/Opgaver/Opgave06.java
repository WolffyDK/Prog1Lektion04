package Opgaver;

public class Opgave06 {
    public static void main(String[] args) {
        int eksempel=345;
        System.out.println("Tværsummen af " + eksempel + " er " + tvaerSum(eksempel));
    }
    public static int tvaerSum(int tal){
        int sum=0;
        while (tal>0){
            sum+=tal%10;
            tal/=10;
        }
        return sum;
    }
}
