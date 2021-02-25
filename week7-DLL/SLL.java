public class SLL<T extends Comparable<T>> implements Queue<T> {

    private Node head, tail;

    @Override
    public void enqueue(T it) {
        // traverse the entire list
        // then add the new Node
    }

    @Override
    public T dequeue() {
        // this was always fast
        // O(1), because we dequeue at the "front" or "Head"
        return null;
    }

    public T removeBack() {
        // even with a reference to tail
        // this is O(n)
        return null;
    }

    @Override
    public T frontValue() {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public boolean contains(T it) {
        return false;
    }

    private class Node {
        Node next;
        T data;
    }
}
