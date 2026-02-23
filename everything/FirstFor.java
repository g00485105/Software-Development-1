public class FirstFor {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
       for (int i = 20; i >= 0; i--) {
            System.out.println(i);
        } 
        int total = 0;
        for ( int number = 1; number <= 15; number += 2) {
            total += number;
        }
        System.out.println("Total: " + total);
    }   
}
