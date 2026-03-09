public class Revision4 {
    public static void main(String[] args) {

    int i = 20, total = 0;
    while ( i >= 10) {
        if( i == 10) {
            System.out.print(i);
        } else {
        System.out.print(i + " + ");
        }
        total += i;
        i-= 2;
    }  
     System.out.println(" = " + total);
    }
}

