import java.util.Scanner;
public class Guess1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 4, guess = 0, count = 0;
        do{
        System.out.print("Guess a number between 1 and 10: ");
        guess = input.nextInt();
        count++;
        } while (number != guess);
        System.out.println("Congratulations! You guessed the number in " + count + " tries.");
        input.close();


    }
}
