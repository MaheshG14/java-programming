package com.demo.ArrayHandler;
public class NestedTryExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {10, 20, 30};

            try {
                // Inner try block
                System.out.println("Accessing element: " + numbers[3]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index is out of bounds!");
            }

            // This will cause ArithmeticException
            int result = 100 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Cannot divide by zero!");
        }

        System.out.println("Program continues...");
    }
}
