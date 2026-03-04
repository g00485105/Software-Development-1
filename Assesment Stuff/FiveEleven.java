public class FiveEleven {
    public static void main(String[] args) {
        String output5 = "", output11 = "", both = "";

        for(int i = 1; i <= 50; i++) {
            if (i % 5 == 0 || i % 11 == 0) {
                System.out.print(i);
                if(i != 50){
                    both += i + ", ";
                }else{
                    both += i;
                }
                
                
            }
            if ( i % 5 == 0 ) {
                System.out.print(i);
                if ( i != 50) {
                    output5 += i + ", ";
                } else {
                    output5 += i;
                }
            }
            if ( i % 11 == 0 ) {
                System.out.print(i);
                if ( i != 44) {
                    output11 += i + ", ";
                } else {
                    output11 += i;
                }
            }
        }
        System.out.println();
        System.out.println("Divisible by 5: " + output5);
        System.out.println("Divisible by 11: " + output11);
        System.out.println("Divisible by both 5 and 11: " + both);
    }
    
}
