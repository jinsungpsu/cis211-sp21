import java.util.Date;

public class StackTester {
    public static void main(String[] args) {
        Stack<String> stringStack = new LinkedNodeStack<>();
        Stack<Integer> numStack = new LinkedNodeStack<>();

        Stack<Double> dStack = new LinkedNodeStack<>();
        Stack<Object> oStack = new LinkedNodeStack<>();

        Stack<Date> dateStack = new LinkedNodeStack<>();

        try {
            stringStack.push("Hello");
            System.out.println(stringStack);

            stringStack.push("World");
            System.out.println(stringStack);

            numStack.push(55);

            int numItems = 1100;
            for (int i = 0; i < numItems; i++) {
                numStack.push(99);
            }
        } catch (CannotAddException e) {
            System.out.println(e);
        }
    }
}
