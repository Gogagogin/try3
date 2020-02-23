package by.gil;

public class Main {

    public static void main(String[] args) {
	 byte b1 = 0, b2 = 0;
	 b1++;
        System.out.println(b1);
        b2 = (byte)(2 + b1++);
        System.out.println("b1=" + b1);
        System.out.println("b2=" + b2);

    }
}
