package by.gil;

public class PrimeNumber {

    public static void main(String[] args) {
        int number = 491;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Число не простое, а имеет как минимум делитель :" + i);
                System.exit(0);
            }
        }
        System.out.println("Число простое");
    }
}
