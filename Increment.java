import java.util.Scanner;
public class Increment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 10;

        System.out.println("Number before post increment: " + number);
        System.out.println("Post increment number: " + number++);
        System.out.println("Number after post increment number: " + number);

        number = 10;

        System.out.println("Number before pre increment: " + number);
        System.out.println("Pre increment number: " + ++number);
        System.out.println("Number after pre increment number: " + number);

        number = 10;

        System.out.println("Number before post decrement: " + number);
        System.out.println("Post decrement number: " + number--);
        System.out.println("Number after post decrement number: " + number);
        
        number = 10;

        System.out.println("Number before pre decrement: " + number);
        System.out.println("Predecrement number: " + --number);
        System.out.println("Number after pre decrement number: " + number);



    }
}