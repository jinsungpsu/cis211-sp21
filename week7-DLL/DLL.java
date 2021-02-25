public class DLL<T extends Comparable<T>> {
    private Node head, tail;

    public DLL() {
        // if we used a header/trailer
        // it would simplify the add algorithm, but would "waste" 2 nodes all the time
        // https://stackoverflow.com/questions/50669861/what-is-the-benefit-to-having-a-header-node-and-a-trailer-node-in-a-linked-list

        head = new Node(null, null, null);
        tail = new Node(null, null, head);
        head.next = tail;
    }

    private void addBetween(Node before, Node after) {

    }

    public void addFront(T item) {
        Node node = new Node(item, head, null);
        if (head != null) { // if DLL is not empty
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
    }

    public void addBack(T item) {
        Node node = new Node(item, null, tail);
        if (tail != null) { // if DLL is empty
            tail.next = node;
        } else {
            head = node;
        }
        tail = node;
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

    public T removeFront(){
        return null;
    }

    public T removeBack(){
        return null;
    }

    public boolean contains(T it) {
        // iterate through the list
        // check if the data on each node matches the "word"
        // return true if found
        return true;
    }

    private class Node {
        T data;
        Node next;
        Node prev;

        public Node(T data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
