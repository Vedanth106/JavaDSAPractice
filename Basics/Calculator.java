import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String operation = sc.nextLine();

        if (operation.equals("Addition")) {
            System.out.println("The Addition of the two numbers is : " + (a + b));
        } else if (operation.equals("Subtraction")) {
            System.out.println("The Subtraction of the numbers is : " + (a - b));
        } else if (operation.equals("Multiplication")) {
            System.out.println("The Multiplication of the numbers is : " + (a * b));
        } else if (operation.equals("Division")) {
            System.out.println("The Division of the two numbers is : " + (a / b));
        } else if (operation.equals("Modulo")) {
            System.out.println("The Remainder of the two numbers is : " + (a % b));
        } else {
            System.out.println("Invalid Operation Entered");
        }
    }
}