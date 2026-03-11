import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        String text = "Question 2";
        do{
            System.out.println("Enter number: ");
            number = input.nextInt();
       for(number >= 4; number++) {
      System.out.print(number + ". " + text);
       }
    }
}
}