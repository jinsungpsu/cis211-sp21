public class ArrayDictionary<K, V> implements Dictionary<K, V> {
    private final int DEFAULT_SIZE = 10;
    private K[] keys = (K[]) (new Object[DEFAULT_SIZE]);
    private V[] values = (V[]) (new Object[DEFAULT_SIZE]);
    private int count = 0;

    @Override
    public void insert(K key, V value) {
        values[count++] = value;
        keys[count-1] = key;
        // runtime complexity: O(1)
    }

    @Override
    public V search(K key) {
        for (int i = 0; i < count; i++) {
            if (key.equals(keys[i])) {
                return values[i];
            }
        }
        return null; // if not found

        // big O runtime complexity is: O(n)
        // arrays give us random access...
        // does it give us an advantage in the search method???
        // NOT REALLY

        // if the arrays were sorted, then random access
        // allows us to do binary search FAST O(log n)
    }

    @Override
    public void remove(K key) {
        // runtime complexity is: O(n)
        for (int i = 0; i < count; i++) {
            if (key.equals(keys[i])) {
                keys[i] = keys[--count];
                values[i] = values[count-1];

                keys[count] = null;
                values[count] = null;

                return;

                // can't reuse that spot!
                // at least not in the way we've currently implemented

                // if I want to reuse that spot?
                // what should I do?????

                // move the values (compress)
                // get rid of the empty spot

                // end result
                // space efficiency UP
                // runtime efficiency DOWN

            }
        }
    }
}
