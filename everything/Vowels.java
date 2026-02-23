import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "";
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

        System.out.print("Enter some text: ");
        text = input.nextLine();

        for (int i = 0; i < text.length(); i ++){
            if (text.toLowerCase().charAt(i) == 'a') {
                aCount++;
            System.out.println("a");
            } else if (text.toLowerCase().charAt(i) == 'e') {
                eCount++;
            System.out.println("e");
            } else if (text.toLowerCase().charAt(i) == 'i') {
                iCount++;
            System.out.println("i");
            } else if (text.toLowerCase().charAt(i) == 'o') {
                oCount++;
            System.out.println("o");
            } else if (text.toLowerCase().charAt(i) == 'u') {
                uCount++;
            System.out.println("u");
            } else {
                System.out.println("Not a vowel");
            }
            
        }
    }
}
