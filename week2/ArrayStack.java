import java.util.NoSuchElementException;

public class ArrayStack<T> implements Stack<T> {
    private final int CAPACITY = 10;
    private T[] stack = (T[])new Object[CAPACITY];
    private int count = 0;


    // PUSH, POP, PEEK are basically setters/getters

    @Override
    public void push(T item) throws CannotAddException{

        if (count >= CAPACITY) {
            // check if there's going to be an array out of bounds
            // check if "this" is "full"
            throw new CannotAddException();
        } else {
            stack[count] = item;
            count++;
        }

    }

    public boolean pushB(T item) {
        if (count >= CAPACITY) {
            // check if there's going to be an array out of bounds
            // check if "this" is "full"
            System.out.println("Yo, I'm full... can't add");
            return false;
        } else {
            System.out.println("Added: " + item + " to stack.");
            stack[count] = item;
            count++;
            return true;
        }
    }


    @Override
    public T pop() throws NoSuchElementException {
        return null;
    }

    @Override
    public T peek() throws NoSuchElementException {
        return stack[count-1];
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < count; i++) {
            output.append(stack[i] + ", ");
        }
        return output.toString();
    }

}
