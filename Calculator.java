import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, number = 0;

        while (number != -1) {
            System.out.print("Enter a number (-1 to quit): ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println ("Sum of number is: " + ++sum);
        input.close();
        }
    }
