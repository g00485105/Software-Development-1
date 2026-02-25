import java.util.Scanner;
public class DoWhiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        do{
            System.out.println("Enter any other value than 0 to quit.");
            i = input.nextInt();
        } while (i == 0);
        
        System.out.println("Ending the program...");
        input.close();
        }
    }
