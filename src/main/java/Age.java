//Exercise 2
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class Age {
    public static void chekAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(" Age must be 18 or older.");
        }else{
            System.out.println("Valide");
        }
    }
    public static void main(String[] args) {

        try {
            Age.chekAge(16);

        }catch (InvalidAgeException e) {
            System.out.println("Exception :"+e.getMessage());
        }
    }
}

