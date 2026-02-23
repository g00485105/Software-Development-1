public class Sum {
    public static void main(String[] args) {
        int total = 0, odd = 0, even = 0, i = 1;
        while (i <= 100) {
            total = total + i;
            if (i % 2 == 0) {
                even = even + i;
            } else {
                odd += i;
            }
            i++;
        }
        System.out.println("Total: " + total);
        System.out.println("Even sum: " + even);
        System.out.println("Odd sum: " + odd);
        if (odd > even){
            odd = odd - even;
        } else {
            odd = even - odd;
        }
        System.out.println("Difference between odd and even: " + odd);
        }
        }

