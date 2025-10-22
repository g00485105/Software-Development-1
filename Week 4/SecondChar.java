import java.util.Scanner;
public class SecondChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        System.out.print("Enter a word: ");
        word = input.next();
        System.out.println("The second character in the word " + word + " is " + word.charAt(1));
    }
}
