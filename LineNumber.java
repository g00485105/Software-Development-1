import java.util.Scanner;
public class LineNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fn;
        int numba;

        System.out.print("Enter a line number: ");
        numba = input.nextInt();

        input.nextLine();
        
        System.out.print("Enter a sentence: ");
        fn = input.nextLine();

        System.out.println(numba + ". " + fn);
       
    }
}
