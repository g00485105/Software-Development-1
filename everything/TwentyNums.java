public class TwentyNums {
public static void main(String[] args) {
    int i = 1;
    int max = 20;

    while (i <= 20) {
        System.out.println(i);
        if (i <= max) {
            System.out.print(i);
            if (i < max) {
                System.out.print(" + ");
            }
        }
        i++;
    }
    System.out.print(i + " + ");
    i = 1;
    while (i <= max) {
        System.out.print(i + " + ");
        i++;

    }
    System.out.print(i);
    System.out.println();
}
}