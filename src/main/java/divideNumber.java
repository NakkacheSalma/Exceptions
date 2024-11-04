//Exercice 1
public class divideNumber {

    public static float divideNumbers(int a, int b) {
        try {
            float s = (float) a/b;
            return s;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("Result: " + divideNumbers(10, 2));
        System.out.println("Result: " + divideNumbers(10, 0));
    }
}
