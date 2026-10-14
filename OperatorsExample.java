
public class OperatorsExample {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 1. Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // 2. Unary Operators
        int x = 5;
        System.out.println("Unary Plus: " + (+x));
        System.out.println("Unary Minus: " + (-x));
        System.out.println("Increment: " + (++x));
        System.out.println("Decrement: " + (--x));
        System.out.println("Logical NOT: " + (!true));
        System.out.println("Bitwise Complement: " + (~x));

        // 3. Assignment Operators
        int n = 10;
        n += 5;
        System.out.println("After += : " + n);
        n -= 2;
        System.out.println("After -= : " + n);
        n *= 2;
        System.out.println("After *= : " + n);
        n /= 2;
        System.out.println("After /= : " + n);
        n %= 3;
        System.out.println("After %= : " + n);

        // 4. Relational Operators
        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater: " + (a > b));
        System.out.println("Less: " + (a < b));
        System.out.println("Greater or Equal: " + (a >= b));
        System.out.println("Less or Equal: " + (a <= b));

        // 5. Logical Operators
        System.out.println("AND: " + (a > 5 && b < 5));
        System.out.println("OR: " + (a < 5 || b < 5));
        System.out.println("NOT: " + !(a > b));

        // 6. Bitwise Operators
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));

        // 7. Shift Operators
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));
        System.out.println("Unsigned Right Shift: " + (a >>> 1));

        // 8. Ternary Operator
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println("Ternary: " + result);

        // 9. instanceof Operator
        String name = "Java";
        System.out.println("Is String: " + (name instanceof String));
    }
}
