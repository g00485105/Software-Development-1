import java.util.Scanner;
public class EvenOdd55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        char quit = 'N';
        do{
            System.out.println("Enter a number: ");
            number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        System.out.println("Do you want to quit? (Y/N)");
        quit = input.next().charAt(0);
        } while (quit == 'N' || quit == 'n');
        System.out.println("Goodbye!");
        input.close();
        }
    }
    
