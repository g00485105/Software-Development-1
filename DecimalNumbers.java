import java.util.Scanner;
public class DecimalNumbers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double first, second;
    System.out.printf("Enter a number: ");
    first = input.nextDouble();
    System.out.printf("Enter another number: ");
    second = input.nextDouble();
    System.out.printf("Number entered were %.1f and  %.1f%n", first, second);

    }
}