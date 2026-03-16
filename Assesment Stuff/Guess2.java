import java.util.Scanner;
public class Guess2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 5, guess = 0, count = 0;
        String play = "y";
        while(play.equals("y")){
        do{
        System.out.print("Guess a number: ");
        guess = input.nextInt();
        count++;

        } while (number != guess);

        System.out.println("Congratulations! You guessed the number in " + count + " tries.");
        System.out.print("Play again (y/n)");
        play = input.next();
        number += 3;
        }
        System.out.println("Gamer Over!");

        input.close();
        

    }
}
