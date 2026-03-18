public class IntArray2 {
    public static void main(String[] args) {
        int[] x = new int[10];
        outputArray(x);
        System.out.println("Index\tValue\n");

        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i]);
        }
        
        for(int i = 0, val = 1; i < x.length; i++, val++){
            x[i] = val;
        }
        System.out.println("Index\tValue\n");
        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i]);
        }
        int[] y = {10, 20, 30, 40};
                outputArray(y);

        int[] z = new int[3];
        z[0] = 105;
        z[1] = 106;
        z[2] = 107;
        outputArray(z);

    }
    public static void outputArray(int[] array){
        System.out.println("Index\tValue\n");
        for(int i = 0; i < array.length; i++){
            System.out.println(i + "\t" + array[i]);
    }
}
}
