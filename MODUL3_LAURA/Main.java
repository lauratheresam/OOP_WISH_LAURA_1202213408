package Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to EAD Police Station\n"
                + "To Create a Driver License, please enter your age: ");
            int age = input.nextInt();
            driverLicense(age);

    }

    public static void DriverLicense(int age) {
        try {
            if (age < 17) {
                throw new ArithmeticException("You are under age to get a driver license");
            } else {
                System.out.println("You are eligible to get a driver license");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
