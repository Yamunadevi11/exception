package exception;
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is not valid to vote.");
        } else {
            System.out.println("Welcome to vote.");
        }
    }
}
