import java.util.Scanner;
public public class EightArray {
    public static void main (String[] args) {
    int[] x = {23, 104, 3, 65, 1002, 90000, 77, 88, 99, 10};
    int[] ix = new int[x.length];
    Scanner input = new Scanner(System.in);
    int found = -1, number = 0;

    System.out.print("Enter a number to remove: ");
    number = input.nextInt();
        for(int i = 1; i < x.length; i++){
            if(number == x[i]){
                found = i;
            }
        }
        if(found == -1){
            System.out.println("Number not found");
        }else{
            for(int i = 0, j = 0; i < x.length; i++){
                if(i != found){
                    ix[j] = x[i];
                    j++;
                }
            }
        }
    }
}
