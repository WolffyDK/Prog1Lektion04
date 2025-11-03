package Opgaver;

public class Opgave02 {
    public static void main(String[] args) {
        //Printer output fra ligetal
        int ligeTal=evenNumbers();
        System.out.println("Tallet med ligetal:"+ ligeTal);
        //Printer output fra kvadrat
        int kvadratTal=qubicNumbers();
        System.out.print("Tallet med kvadrattal:"+ kvadratTal);
    }
    //Metode til at give svar på ligetal
    public static int evenNumbers(){
        int number =2;
        int sum=0;
        while (number<=100){
            sum=sum+number;
            number=number+2;
        }
        return sum;
    }

    public static int qubicNumbers() {
        int sum = 0;
        int number = 1;
        while (number*number <= 100) {
            sum+=number*number;
            number++;
        }
        return sum;
    }
}
