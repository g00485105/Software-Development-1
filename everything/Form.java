import java.util.Scanner;
public class Form {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fn, email;
        int numba;

        System.out.print("Enter your full name: ");
        fn = input.nextLine();
        
        System.out.print("Enter your phone number: ");
        numba = input.nextInt();

        System.out.print("Enter your email: ");
        email = input.next();

        String number = Integer.toString(numba);

        number = "(0" + number.substring(0,2) + ") " + number.substring(2);

        System.out.println("-=================================-");
        System.out.println("-               ATU               -");
        System.out.println("-=================================-");
        System.out.println("- Name:         -"+ fn +"-");
        System.out.println("-----------------------------------");
        System.out.println("- Phone Number: - "+ number +"   -");
        System.out.println("-----------------------------------");
        System.out.println("- Email:        - "+ email +"  -");
        System.out.println("-----------------------------------");
       
    }
}