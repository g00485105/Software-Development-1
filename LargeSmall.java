import java.util.Scanner;
public class LargeSmall {
    public static void main(String[] args) {
        int large = 0, small = 0, number = 0, counter = 1;
        Scanner input = new Scanner(System.in);
        while(counter <= 5){
            System.out.print("Enter number: ");
            number = input.nextInt();
            if(number > 0) {
                if(counter == 1) {
                    large = number;
                    small = number;
                }else{
                    if(number > large) {
                        large = number;
                    }
                    if(small > number) {
                        small = number;
                    }
                }
                counter++;
            }
            else{
                System.out.println("Please enter a positive number.");
            }
        }
        System.out.println("Largest number is: " + large);
        System.out.println("Smallest number is: " + small);
        
    
        input.close();
    }
}