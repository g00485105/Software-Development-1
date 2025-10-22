import java.util.Scanner;
public class AddProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;

        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
        System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + (num1 * num2 * num3));
    }
}

