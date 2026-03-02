import java.util.Scanner;
public class Grades2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0, number = 0, i = 0;
    
        for (; number >= 0; i++) {
            System.out.print("Enter a grade: " +( i + 1) + "(neagtive number to quit): ");
            number = input.nextInt();
            if(number >= 0 ) {
                i++;
                total += number;
            }
        }
        System.out.println("Total: " + total);
        System.out.println("Average grade is: " + ((total * 1.0) / i));
        System.out.printf("Average grade is: %.2f%n", ((total * 1.0) / i));
        input.close();
    }
}
