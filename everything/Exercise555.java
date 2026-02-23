import java.util.Scanner;
public class Exercise555 {
    public static void main(String[] args) {
        int minutes = 0;
        int seconds = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of minutes: ");
        minutes = input.nextInt();
        seconds = minutes * 60;

    
    for (int i = seconds; i >= 0; i--) {
        System.out.println(i + " ");
    }
    System.out.println("Time's up!");
    input.close();
}
}
