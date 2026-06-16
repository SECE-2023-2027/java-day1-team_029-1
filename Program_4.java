import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String binary1 = sc.nextLine();

        System.out.print("Input second binary number: ");
        String binary2 = sc.nextLine();

        // Convert binary strings to decimal numbers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the numbers
        int sum = num1 + num2;

        // Convert the sum back to binary
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Sum of two binary numbers: " + binarySum);

        sc.close();
    }
}