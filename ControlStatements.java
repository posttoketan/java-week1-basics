
public class ControlStatements {
    public static void main(String[] args) {

        int marks = 75;

        // 1. If-Else Statement
        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // 2. Else-If Statement
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        // 3. Switch Statement
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 4. Break Statement
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Break example: " + i);
        }

        // 5. Continue Statement
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Continue example: " + i);
        }
    }
}
