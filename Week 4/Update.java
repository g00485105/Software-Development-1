import java.util.Scanner;
public class Update {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        System.out.print("Enter a word: ");
        word = input.next();
        System.out.println("When the 'x' character in the string " + word + " are replaced with 'u' characters, " + word +  " is updated to " + word.replace('x', 'u'));
    }
}
