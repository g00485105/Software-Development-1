import java.util.Scanner;
public class printingAndDecisions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Arma";
        int first = 0, second = 0;
        double pi = 3.141592;

        System.out.printf("Hello %s. The value of PI is %.2f.%nMy favourite colour is %s.%n", name, pi, "green");
        System.out.printf("A good number is %d%n", 100);

        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();

        if(first == second){
            System.out.println(first + " == " + second); // equalt to
        }
        if(first > second){
            System.out.println(first + " > " + second); // greater than
        }
        if(first >= second){
            System.out.println(first + " >= " + second); // greater than or equal to
        }
        if(first < second){
            System.out.println(first + " < " + second); // less than
        }
        if(first <= second){
            System.out.println(first + " <= " + second); // less than or equal to
        }
        if(first != second){
            System.out.println(first + " != " + second); // not equal to
        }
        }
}
