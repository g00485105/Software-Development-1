import java.util.Scanner;
public class Revision7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag = 0;
        do{ 
            System.out.print("Enter -1 to quit: ");
            flag = input.nextInt();
        }while(flag != -1);
        input.close();
    }
}
