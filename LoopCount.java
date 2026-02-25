import java.util.Scanner;
public class LoopCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0, count = 0;

        System.out.print("Want to loop: (0 for yes, 1 for no): ");
        i = input.nextInt();
        while (i == 0) {
            System.out.print("Want to loop: (0 for yes, 1 for no): ");
            i = input.nextInt();
            count++;
        }
        //if (i == 1) {
            System.out.println("You looped " + count + " times.");
        //}
        input.close();
        }
}
