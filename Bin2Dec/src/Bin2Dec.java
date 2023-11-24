package Bin2Dec.src;

import java.util.Scanner;

public class Bin2Dec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter up to 8 binary digits: ");
        String binaryInput = scanner.nextLine();

        // Check if the input is valid
        if (isValidBinary(binaryInput)) {
            // Convert binary to decimal
            int decimalResult = binaryToDecimal(binaryInput);

            // Display the result
            System.out.println("Decimal equivalent: " + decimalResult);
        } else {
            System.out.println("Invalid input. Please enter only 0's and 1's.");
        }

        scanner.close();
    }

    // Function to check if the input is a valid binary string
    private static boolean isValidBinary(String binaryInput) {
        return binaryInput.matches("[01]+") && binaryInput.length() <= 8;
    }

    // Function to convert binary to decimal
    private static int binaryToDecimal(String binaryInput) {
        int decimalResult = 0;
        int length = binaryInput.length();

        for (int i = 0; i < length; i++) {
            int digit = binaryInput.charAt(i) - '0';
            int power = length - 1 - i;
            decimalResult += digit * Math.pow(2, power);
        }

        return decimalResult;
    }
}