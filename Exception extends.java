package com.exception;

// Custom exception class must extend Exception (or RuntimeException)
class MyException extends Exception {
    private static final long serialVersionUID = 1L;

    public MyException(String message) {
        super(message);
    }
}

public class MyExceptionexceptionException {
    public static void main(String[] args) {
        try {
            int age = 16;
            if (age > 18) {
                throw new MyException("Welcome! You can vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        } catch (MyException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }

        // Continue program
        System.out.println("Program continues...");
    }
}