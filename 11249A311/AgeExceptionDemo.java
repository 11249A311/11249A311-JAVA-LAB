import java.util.Scanner;

public class AgeExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String input = sc.nextLine();

            // May cause NumberFormatException
            int age = Integer.parseInt(input);

            System.out.println("Age entered: " + age);

            // May cause ArithmeticException
            int result = 100 / (age - age);

            System.out.println("Result: " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception: Please enter a valid number for age.");
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: Arithmetic error occurred (division by zero).");
        }
        finally {
            sc.close();
        }
    }
}