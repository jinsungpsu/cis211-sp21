public class Tester {
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();

        stack.push(1);
        stack.push(2);

        System.out.println(stack.peek()); // 2
        System.out.println(stack); // 2 1

        stack.push(3);
        System.out.println(stack.peek()); // 3
        System.out.println(stack); // 3 2 1

    }
}
