package by.gil;

public class Main {

    public static void main(String[] args) {

            int number = 493;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Число не простое, а имеет как минимум делитель :" + i);
                    break;
                }
            }
            System.out.println("Число простое");
        }
}

