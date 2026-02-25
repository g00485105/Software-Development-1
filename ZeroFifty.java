import java.util.Scanner;
public class ZeroFifty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("Enter any number between 0 and 50: ");
            number = input.nextInt();
        } while (number < 0 && number > 50);
        
        System.out.println("Ending the program...");
        input.close();
        }
    }
