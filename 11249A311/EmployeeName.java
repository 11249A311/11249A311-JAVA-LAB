import java.util.Scanner;

public class EmployeeName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Both employees have the same name.");
        } else {
            System.out.println("Employees have different names.");
        }

        System.out.println("First name length: " + name1.length());
        System.out.println("Second name length: " + name2.length());

        sc.close();
    }
}
