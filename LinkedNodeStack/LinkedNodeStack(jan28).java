import java.util.NoSuchElementException;

public class LinkedNodeStack<T> implements Stack<T> {
    Node head;

    @Override
    public void push(T item) throws CannotAddException {

        // this is a special case...
        // this is only if it's the FIRST item...

        if (head == null) {
            // we don't add things directly
            // we wrap the "thing" we are adding into a Node object
            // the node object has data
            // the node object also has to keep
            // track of where to find the "next" item
            Node<T> node = new Node<>();
            node.setData(item);

            // in this case, there is no next item, because it's the only item
            node.setNext(null);

            head = node;
        } else {
            // if there's other existing nodes, then the algorithm looks like
            // from visualgo
            // create a new node
            Node<T> node = new Node<>();
            node.data = item;

            // point new node to head
            node.next = head;

            // reassign head to new node
            head = node;
        }

    }

    @Override
    public T pop() throws NoSuchElementException {
        return null;
    }

    @Override
    public T peek() throws NoSuchElementException {
        // don't we just return the data that's at the "top?"
        // top is head, right?

        return (T)head.getData();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        // traverse the linked list, starting from head...
        // b/c we have no other choice...
        // until when the node's next value is null
        Node<T> itr = head;

        while(itr != null) { // this means I'm at the tail
            output.append(itr.getData() + " ");
            itr = itr.next;
        }
        return output.toString();
    }
}
