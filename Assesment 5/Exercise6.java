import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        if(number < 100){
            System.out.println("The number is less than 100");
        }else if (number > 100) {
            System.out.println("The number is more than 100");
        }else if (number == 100) {
            System.out.println("The number is 100");
        }else{
            System.out.println("Invalid number");
        }
        input.close();
    }
}