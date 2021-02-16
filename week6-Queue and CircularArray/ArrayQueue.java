import java.util.NoSuchElementException;

public class ArrayQueue<T> implements Queue<T> {
    private final int DEFAULT_CAPACITY = 5;
    private T[] queue;
    private int count = 0;
    private int front = -1;
    private int back = -1;

    public ArrayQueue() {
        queue = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    @Override
    public void enqueue(T item) {
        if (count == 0) {
            back = 0;
            front = 0;
            queue[0] = item;
            count++;
        } else {
            if (back>queue.length-1) {
                back -= queue.length;
            } else {
                back++;
                queue[back] = item;
                count++;
            }
        }
    }

    @Override
    public T dequeue() throws NoSuchElementException {
        if (count==0) {
            throw new NoSuchElementException();
        } else {
            count--;
            front++;
            return queue[front-1];
        }
    }

    @Override
    public T peek() throws NoSuchElementException {
        if (count==0) {
            throw new NoSuchElementException();
        } else {
            return queue[front];
        }
    }
}
