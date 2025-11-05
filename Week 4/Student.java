import java.util.Scanner;
public class Student {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name, id;
        int age;
        double grade;

        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter student ID: ");
        id = input.next();
        System.out.print("Enter average grade: ");
        grade = input.nextDouble();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.println("+------------------------------+");
        System.out.println("| " + name + "\t| " + id + "| " + grade + "|   " + age + "|");
        System.out.println("+------------------------------+");
    
    }   
}
