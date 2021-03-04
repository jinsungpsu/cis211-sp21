public class DLLDictionary<K extends Comparable<K>, V> implements Dictionary<K, V> {
    private Node head = null;
    private Node tail = null;

    @Override
    public void insert(K key, V value) {

        // what is big o runtime complexity of insert
        // in a DLL implementation of the dictionary ADT?
        // O(1) - constant time

        // special case for empty
        if (head == null) {
            Node node = new Node(null, key, value, null);
            head = tail = node;
        } else { // there's at least one node in there already
            Node node = new Node(null, key, value, head);
            head.prev = node;
            head = node;
        }
    }

    @Override
    public V search(K key) {
        // big o time complexity of search?
        // O(n)
        // best, worst, average...
        // O(1), O(n), O(n/2) -> O(n)

        Node itr = head;
        while (itr != null) {
            if (key.compareTo(itr.key) == 0) {
                return itr.value;
            }
            itr = itr.next;
        }
        return null;
    }

    @Override
    public void remove(K key) {
        // time complexity of remove?
        // O(n), because you have to find where the node to remove is
        // in order to do that, you have to traverse the linked list until you
        // find the key!

        /*
        https://visualgo.net/en/list
        Remove from middle pseudocode from DLL

        if empty, do nothing
        Vertex pre = head
        for (k = 0; k < i-1; k++)
          pre = pre.next
        Vertex del = pre.next, aft = del.next
        pre.next = aft, aft.prev = pre
        delete del
         */

        // if remove at head

        // if remove in the mid

        // if remove at end
    }

    @Override
    public String toString() {
        return "";
    }

    private class Node {
        K key;
        V value;
        Node next, prev;

        public Node(Node prev, K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
