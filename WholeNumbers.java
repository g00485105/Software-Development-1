import java.util.Scanner;
public class WholeNumbers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.printf("Enter a number: ");
    int x = input.nextInt();
    System.out.printf("Enter another number: ");
    int y = input.nextInt();
    System.out.printf("Number entered were %d and  %d%n", x, y);

    }
}