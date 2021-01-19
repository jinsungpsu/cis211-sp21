public class StackTester {
    public static void main(String[] args) {
        Stack numStack = new ArrayStack();

        numStack.push(0);
        numStack.push(1);
        numStack.push(2);
        numStack.push(3);
        numStack.push(4);

        System.out.println(numStack.peek());  // 4
        System.out.println(numStack.peek());  // 4

        System.out.println(numStack.pop());  // 4
        System.out.println(numStack.pop());  // 3
        System.out.println(numStack.pop());  // 2
        System.out.println(numStack.pop());  // 1

    }
}
