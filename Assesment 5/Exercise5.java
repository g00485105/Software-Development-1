import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value = "";

        System.out.print("Enter a string: ");
        value = input.nextLine();

        System.out.println("Your string has " + value.length() + " characters.");
        input.close();
    }
}
