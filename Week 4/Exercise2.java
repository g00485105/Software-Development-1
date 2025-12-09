import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double euro, rate, sterling;

        System.out.println();    
        System.out.print("Enter your name: ");
        name = input.next();
        System.out.print("Enter euro amount: ");
        euro = input.nextDouble();
        System.out.print("Enter sterling conversion rate: ");
        rate = input.nextDouble();
       
        sterling = (Math.round(euro * rate * 100) / 100);

        System.out.println(name + ", " + euro + " euro will get you " + sterling + " pounds sterling.");
        input.close();
    }
}