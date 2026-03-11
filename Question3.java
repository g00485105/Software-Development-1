import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pos = 0, count = 0;

        System.out.print("Enter a positive number (Enter value less than 1 to stop): ");
        pos = input.nextInt();
        while(pos > 0){
            System.out.print("Enter a positive number (Enter value less than 1 to stop): ");
            pos = input.nextInt();
            count++;
        }
        
        System.out.println("You entered " + count + " positive numbers.");
        input.close();
    }
}
