import java.util.Scanner;
public class Wages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hours = 0;
        double rate = 0;
        double total = 0;
        int i = 1;
        while (i <= 3) {
            System.out.print("Hours worked: ");
            hours = input.nextDouble();
            System.out.print("Hourly rate: ");
            rate = input.nextDouble();
            
            if ( hours <=40) {
                total = hours * rate;
            } else {
                total = (40 * rate) + (hours - 40) * (rate * 1.5);
            }
            System.out.println("Pay for my employee " + i + ": " + total);
            System.out.println();
            i++;
        }
        input.close();
    }
}