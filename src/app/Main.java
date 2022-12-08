package app;

public class Main {
    static double number1;
    static double number2;
    static double sum;
    static double times;
    public static void main(String[] args) {
        System.out.println("I actually used main. I am changing sout");

        number1 = 1;

        number2 = 2;

        System.out.println(number1 + " plus " + number2 + " equals " + addition(number1, number2));

        System.out.println(number1 + " times " + number2 + " equals " + multiplication(number1, number2));
    }

    public static double addition(double number1, double number2) {
        sum = number1 + number2;
        return sum;
    }
    public static double multiplication(double number1, double number2) {
        times = number1 * number2;
        return times;
    }
}
