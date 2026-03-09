public class Revision6 {
public static void main(String[] args) {
    
    System.out.println("Part a: ");
    System.out.println();
    for(int i = 1; i <= 6; i++) {
        for(int j = 1; j <= i; j++) {
            System.out.print(j);
            if(j != i) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    System.out.println("Part b: ");
    System.out.println();
    for(int k = 10; k <= 15; k++) {
        for(int l = 10; l <= k; l++) {
            System.out.print(l);
            if(l != k) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
