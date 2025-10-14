import java.util.Scanner;
public class InputDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numba;

        System.out.print("Enter a decimal number: ");
        numba = input.nextDouble();

        System.out.println("Number entered is: " + numba);
       
    }
}
