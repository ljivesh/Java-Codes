import java.util.Scanner;

public class Lab22 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            if (age < 0) {
                throw new Exception("Age cannot be negative!");
            } else if (age > 120) {
                throw new Exception("Are you sure you're that old?");
            } else {
                System.out.println("Your age is: " + age);
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            throw e;
        } finally {
            System.out.println("End of program.");
        }
    }
}
