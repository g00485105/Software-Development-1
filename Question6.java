public class Question6 {
public static void main(String[] args) {
    
    System.out.println("Part a: ");
    System.out.println("------");
    System.out.println();
    for(int i = 1; i <= 4; i++) {
      System.out.print("line " + i + ": ");
        for(int j = 1; j <= 4; j += 1) {
            System.out.print(j + " ");        
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("Part b: ");
    System.out.println("------");
    System.out.println();
    for(int i = 4; i >= 1; i--) {
      System.out.print("line " + i + ": ");
        for(int j = 4; j >= 1; j -= 1) {
            System.out.print(j + " ");        
        }
        System.out.println();
    }
}
}