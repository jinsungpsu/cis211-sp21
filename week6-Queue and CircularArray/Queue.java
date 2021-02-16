import java.util.NoSuchElementException;

public interface Queue<T> {
    public void enqueue(T item);

    public T dequeue() throws NoSuchElementException;

    public T peek() throws NoSuchElementException;
}
