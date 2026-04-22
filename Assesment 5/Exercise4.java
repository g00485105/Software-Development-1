import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {30, 40, 71};
        String[] num = {"", "", ""};

        System.out.print("int[] numbers = {");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("}");

        System.out.print("Enter a first string: ");
        num[0] = input.nextLine();
        System.out.print("Enter a second string: ");
        num[1] = input.nextLine();
        System.out.print("Enter a third string: ");
        num[2] = input.nextLine();

        System.out.println("String\tCharacter Count");
        System.out.println("-----\t-----");
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i] + "\t" + num[i].length());
        }
        input.close();
    }
}