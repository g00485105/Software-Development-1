import java.util.Scanner;
public class Grades1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0, numberOfGrades = 3;
    
        for ( int i = 1; i <= numberOfGrades; i++) {
            System.out.print("Enter a grade: " + i + ": ");
            total += input.nextInt();            
        }
        System.out.println("Average grade is: " + ((total * 1.0) / numberOfGrades));
        System.out.printf("Average grade is: %.2f%n", ((total * 1.0) / numberOfGrades));
        input.close();
    }
}
