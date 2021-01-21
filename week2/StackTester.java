import java.util.Date;

public class StackTester {
    public static void main(String[] args) {
        Stack<String> stringStack = new ArrayStack<>();
        Stack<Integer> numStack = new ArrayStack<>();
        Stack<Car> carStack = new ArrayStack<>();


        Stack<Double> dStack = new ArrayStack<>();
        Stack<Object> oStack = new ArrayStack<>();

        Stack<Date> dateStack = new ArrayStack<>();

        try {
            stringStack.push("Hello");
            System.out.println(stringStack);

            stringStack.push("World");
            System.out.println(stringStack);




            numStack.push(55);
            carStack.push(new Car());

            int numItems = 1100;
            for (int i = 0; i < numItems; i++) {
                numStack.push(99);
            }
        } catch (CannotAddException e) {
            System.out.println(e);
        }
    }
}
