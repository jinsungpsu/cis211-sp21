public class LinkedStack<T> {
    private Node head;

    public void push(T item) {
        Node node = new Node(item, null);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public T pop() {
        return null;
    }

    public T peek() {
        return head.data;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        Node itr = head;

        while(itr != null) {
            output.append(itr.data + " ");
            itr = itr.next;
        }
        return output.toString();
    }

    public int lengthIterative() {
        Node itr = head;
        int length = 0;

        while(itr != null) {
            itr = itr.next;
            length++;
        }

        return length;
    }

    public int lengthRecursive() {
        return lengthRecur(head);
    }

    private int lengthRecur(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.next == null) {
            return 1;
        } else {
            return 1+lengthRecur(node.next);
        }
    }

    private class Node {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
