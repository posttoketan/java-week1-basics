public class LoopsExample {
    public static void main(String[] args) {

        // 1. For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2. While Loop
        System.out.println("While Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // 3. Do-While Loop
        System.out.println("Do-While Loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        // 4. Enhanced For Loop
        System.out.println("Enhanced For Loop:");
        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
