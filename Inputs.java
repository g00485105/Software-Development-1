import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fn;
        int numba;
        Double decimal;

        System.out.print("Enter your first name: ");
        fn = input.next();
        System.out.print("Enter a number: ");
        numba = input.nextInt();
        System.out.print("Enter a decimal number: ");
        decimal = input.nextDouble();

        System.out.println(fn + ", you entered the numbers " + numba + " and " + decimal);
       
    }
}
