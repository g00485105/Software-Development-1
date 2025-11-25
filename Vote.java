import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 18;

        System.out.print("Enter your age: ");
        age = input.nextInt();
        if(age >= 0 && age <= 199){
        if(age >= 18) {
            System.out.println("You are allowed to vote.");
        } else {
            System.out.println("You are not allowed to vote.");
        }
        } else {
            System.out.println("Invalid age entered.");
        }
        input.close();
    }
}