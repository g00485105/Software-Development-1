import java.util.Scanner;
public class CharacterType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        boolean other = true;

        System.out.print("Enter a character: ");
        ch = input.next().charAt(0);

        if(Character.isDigit(ch)){
            System.out.println("The character is a digit.");
            other = false;
        }
                if(Character.isLetter(ch)){
            System.out.println("The character is a letter.");
            other = false;
        }
        if(other){
            System.out.println("You entered a value which is not a digit nor a letter.");
        }
        input.close();
    }
}
