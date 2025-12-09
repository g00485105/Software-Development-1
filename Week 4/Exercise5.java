import java.util.Scanner;
public class Exercise5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double minutes = 0, distance = 5.0, pace = 0;
        String metric;

        System.out.print("Enter a target time in minutes: ");
        minutes = input.nextInt();
        System.out.print("Preffered metric: \nA. Miles \nB. Kilometres \nEnter a or b: ");
        metric = input.next();
        
        if(metric.toLowerCase().equals("a")){
            metric = "Miles";
            System.out.println("Miles");
        }else if(metric.toLowerCase().equals("b")){
            metric = "Kilometres";
            System.out.println("Kilometres");
        }else{
            System.out.println("Invalid choice.");
        }
        System.out.println("Pace required to run " + distance + " " + metric + " in " + minutes + " minutes is: \n" + (minutes / distance) + " minutes per " + metric );
    }
}