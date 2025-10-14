import java.util.Scanner;
public class InputString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fn;

        System.out.print("Enter your first name: ");
        fn = input.next();

        System.out.println("Hello " + fn);
       
    }
}
