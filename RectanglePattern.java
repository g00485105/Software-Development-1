import java.util.Scanner;
public class RectanglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = 0, lenght = 0;

        System.out.print("Enter width: ");
        width = input.nextInt();
        System.out.print("Enter lenght: ");
        lenght = input.nextInt();


        int i = 1, j = 1;
        System.out.println();
        while(i <= width){
            j = 1;
            while(j <= lenght) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
