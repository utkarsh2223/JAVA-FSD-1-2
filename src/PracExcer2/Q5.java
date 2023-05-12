package PracExcer2;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Negative number entered!");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        try {
            int num = scanner.nextInt();
            if (num < 0) {
                throw new NegativeNumberException();
            }
            int result = 100 / num;
            System.out.println("Result: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program completed.");
        }
    }
}
