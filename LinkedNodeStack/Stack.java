import java.util.NoSuchElementException;

public interface Stack<T> {
    public void push(T item) throws CannotAddException;

    public T pop() throws NoSuchElementException;

    public T peek() throws NoSuchElementException;
}
