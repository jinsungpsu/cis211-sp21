public class HashDictionary<K, V> implements Dictionary<K, V> {


    private final int ARRAY_CAPACITY = 1000;
    private V[] dictionary = (V[])(new Object[ARRAY_CAPACITY]);
    private int count = 0;

    @Override
    public void insert(K key, V value) {
        dictionary[hash(key)%ARRAY_CAPACITY] = value;
        count++;
        // in closed hashing
        // if there's a collision
        // meaning that spot is already taken
        // i'm gonna keep checking adjacent spots to see if there's
        // a new place I can put the item

    }

    private int hash(K key) {
        // terrible hash function!
        // non-uniform distribution - every key will result in hash
        // value of 0!
        // it's not O(1), it is now O(n), so very slow
        for (int i = 0; i<count; i++) {

        }
        return 0;
    }

    @Override
    public V search(K key) {
        // in closed hashing, how do I ensure the correct
        // value is returned (in case there was a collision?)

        // check if the key matches to what we actually there
        // and if it's not found... check adjacent spots to see
        // if I can find what I'm looking
        return dictionary[hash(key)%ARRAY_CAPACITY];
    }

    @Override
    public void remove(K key) {

    }
}
