
public class ArraysExample {
    public static void main(String[] args) {

        // 1. Declare and initialize an array
        int[] marks = {75, 80, 65, 90, 85};

        // 2. Display all array elements
        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // 3. Calculate the sum
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        System.out.println("Total Marks: " + sum);

        // 4. Calculate the average
        double average = (double) sum / marks.length;
        System.out.println("Average Marks: " + average);

        // 5. Find the highest mark
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        System.out.println("Highest Mark: " + highest);

        // 6. Update an array element
        marks[0] = 95;
        System.out.println("Updated First Mark: " + marks[0]);

        // 7. Display array length
        System.out.println("Array Length: " + marks.length);
    }
}
