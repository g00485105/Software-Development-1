import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String text = " ";
    int i = 1;

     System.out.print("Enter some text: ");
     text = input.nextLine();

     while ( i <= 11) {
            System.out.println(i + ". " + text);
            i++;
    }
input.close();
}
}