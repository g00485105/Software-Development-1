public class Question5 {
public static void main(String[] args) {
    
    System.out.println("Part a: ");
    System.out.println("------");
    System.out.println();
    for(int i = 1; i <= 4; i++) {
        for(int j = 1; j <= 5; j++) {
            System.out.print("r" + i + "c" + j + " ");
        
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("Part b: ");
    System.out.println("------");
    System.out.println();
    for(int k = 4; k >= 1; k--) {
        for(int l = 5; l >= 1; l--) {
            System.out.print("r" + k + "c" + l + " ");
        
        }
        System.out.println();
    }
    }
}
