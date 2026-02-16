import java.util.Scanner;
public class Valid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "";
        boolean isValid = true;
        
        while (isValid) {
            System.out.print("Enter some text: ");
            text = input.nextLine();
            for (int i = 0; i < text.length(); i++){
                if (text.toLowerCase().charAt(i) == '@') {
                isValid = false;
                    }
                }
                if (!isValid) {
                    System.out.println("Text is valid.");
                } else {
                    System.out.println("Text is invalid.");
                }
            }
    }
}
