public class DLLQueue<T extends Comparable<T>> implements Queue<T> {
    private Node tail, head;
    @Override
    public void enqueue(T it) {

    }

    @Override
    public T dequeue() {
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
        // iterate through the node
        // if (the node.compareTo(it) == 0) this is essentially same as node == it by using compareTo
        return false;
    }

    private class Node {
        Node prev, next;
        T data;
    }
}
