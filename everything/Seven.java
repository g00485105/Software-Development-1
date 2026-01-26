import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 7;

        System.out.print("Enter a number:");
        number = input.nextInt();

        if(number == 7) {
            System.out.println("You entered 7!");
        } else {
            System.out.println("You did not enter 7.");
        }
        input.close();
    }
}
