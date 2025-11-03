package Opgaver;

public class Opgave02_2 {
    public static void main(String[] args) {
        System.out.println(evenNumbers());
        System.out.println(qubicNumbers());
    }
    public static int evenNumbers(){
        int sum=0;
        for (int i = 0; i <=100 ; i++) {
            if (i % 2 ==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static int qubicNumbers () {
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            int kvadrat =i*i;
            if (kvadrat<=100){
                sum=sum+kvadrat;
            }
        }
        return sum;
    }
}