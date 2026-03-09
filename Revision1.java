public class Revision1 {
    public static void main(String[] args) {
        System.out.println("While Loop");
        System.out.println("----- ----");

        int i = 1;
        while ( i <= 4) {
            System.out.println("Assesment " + i);
            i++;
        }
        System.out.println();
        System.out.println("For Loop");
        System.out.println("--- ----");
        for ( i = 1; i <= 4; i++) {
            System.out.println("Assesment " + i);
        }
        System.out.println();
        System.out.println("Do While");
        System.out.println("-- -----");
        i = 1;
        do{
            System.out.println("Assesment " + i);
            i++;
        } while ( i <= 4);
        
    }
}
