import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000, choice = 0, withdraw = 0;
        System.out.println("Welcome to the ATM");
        System.out.println("Would you like to:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.print("Enter Choice: ");
        choice = input.nextInt();
        if (choice == 1) {
            System. out.println("Balance: " + balance);
        } else if (choice == 2) {
            System.out.print("Enter amount to deposit: ");
            balance = balance + input.nextInt();
            System.out.println("Balance: " + balance);
        } else if (choice == 3) {
            System.out.println("Enter an amount to withdraw: ");
            withdraw = input.nextInt();
            if (withdraw > balance) {
                System.out.println("Insufficient Funds");
            } else { 
                balance = balance - withdraw;
            }
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid Choice");
        }
        input.close();
     }
 }