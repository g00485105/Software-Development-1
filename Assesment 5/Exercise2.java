import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int spent = 0;
        System.out.print("Enter an amount of money: ");
        spent = input.nextInt();

        if(spent >= 200){
            System.out.println("Platinum");
        }else if(spent >= 150 && spent < 200){
            System.out.println("Gold");
        }else if(spent >= 100 && spent < 150){
            System.out.println("Silver");
        }else if(spent >= 50 && spent < 100){
            System.out.println("Bronze");
        }else if(spent >= 1 && spent < 50){
            System.out.println("No Discount");
        }else{
            System.out.println("Invalid amount");
        }
        input.close();
        }
    } 
