//Exercise 3
public class ParseDivideNumber {

    public static float parseAndDivide(String a, String b){
        try{
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            float r = (float )num1 / num2;
            return r;
        }catch (NumberFormatException e){
            System.out.println(" Invalid input. Please enter valid numbers.");
            return 0;

        }catch (ArithmeticException e){
           System.out.println("Cannot divide by zero.");
            return 0;
        }

    }

    public static void main(String[] args) {

        System.out.println("Result: " + parseAndDivide("13", "2"));
        System.out.println("Result: " + parseAndDivide("ten", "2"));
        System.out.println("Result: " +  parseAndDivide("10", "0"));
    }
}
