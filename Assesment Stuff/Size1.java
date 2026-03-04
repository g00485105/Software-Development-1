import java.util.Scanner;
public class Size1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;

        System.out.print("Enter a number: ");
        size = input.nextInt();

        if (size > 70 && size <= 100) {
            System.out.println("Go for large size");
        } else if (size > 35 && size <= 70) {
            System.out.println("Go for medium size");
        } else if (size > 10 && size <= 35) { 
            System.out.println("Go for small size");       
        } else { 
            System.out.println("size is not available");
        }
            input.close();
        }
        }
            