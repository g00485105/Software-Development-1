import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String unit;
        int num1 = 0, num2 = 0;

        System.out.print("Enter the length of the rectangle: ");
        num1 = input.nextInt();
        System.out.print("Enter the width of the reactangle: ");
        num2 = input.nextInt();
        System.out.print("Enter the unit of measurement: ");
        unit = input.next();

        System.out.println("Area of rectangle is " + (num1 * num2) + " " + unit + " squared.");
        
        input.close();
    }
}

