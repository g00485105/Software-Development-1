import java.util.Scanner;
public class NumberRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number > 10 && number <= 20){
            System.out.println("Number is in the range 10, 20.");
        } else {
            System.out.println("Number is out of the range 10, 20.");
        }
        input.close();
    
    }
}
