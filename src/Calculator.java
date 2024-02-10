
import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first num : ");

        while(!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next();
        }

        double num1 = scanner.nextDouble();
        System.out.println("Enter operator (+, -, *, /):");

        while(true) {
            String input = scanner.next();
            if (input.length() == 1 && "+-*/".indexOf(input.charAt(0)) != -1) {
                char operator = input.charAt(0);
                System.out.println("enter second num :");

                while(!scanner.hasNextDouble()) {
                    System.out.println("invalid input, please type valid number");
                    scanner.next();
                }

                double num2 = scanner.nextDouble();
                double result;
                if (operator == '+') {
                    result = num1 + num2;
                } else if (operator == '-') {
                    result = num1 - num2;
                } else if (operator == '*') {
                    result = num1 * num2;
                } else {
                    if (operator != '/') {
                        System.out.println("Error: Invalid operator.");
                        return;
                    }

                    if (num2 == 0.0) {
                        System.out.println("Error: Cannot divide by zero.");
                        return;
                    }

                    result = num1 / num2;
                }

                if (result % 1.0 == 0.0) {
                    System.out.println("Result: " + (int)result);
                } else {
                    System.out.println("Result: " + result);
                }

                return;
            }

            System.out.println("Invalid operator. Please enter a valid operator (+, -, *, /):");
        }
    }
}
