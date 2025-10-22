import java.util.Scanner;
public class SubStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        System.out.print("Enter a word: ");
        word = input.next();
        System.out.println("The substring created from the first 4 characters of the word " + word + " is " + word.substring(0,4));
    }
}
