public class Exercise1 {
    public static void main(String [] args) {
        String name = "Claire";
        int age = 20;
        double euro = 20.0, rate = 0.87, sterling = 0;

        sterling = (( euro * rate ) + 0);

        System.out.println("------------------------------------");
        System.out.println("| Name:                   | " + name + " |");
        System.out.println("------------------------------------");
        System.out.println("| Age:                    | "  +  age + "     |");
         System.out.println("------------------------------------");
        System.out.println("| Euro:                   | "  +  euro + "   |");
         System.out.println("------------------------------------");
        System.out.println("| Coversion Rate:         | " + rate + "   |");
        System.out.println("------------------------------------");
        System.out.println("| Sterling:               | " + sterling + "0  |");
        System.out.println("------------------------------------");
    }
}