public interface Dictionary<K extends Comparable<K>, V> {
    public void insert(K key, V value);

    public V search(K key);

    public void remove(K key);
}
