public interface BinarySearchTree<K extends Comparable<K>, V> {
    public void insert(K key, V value);

    public V remove(K key);

    public V search(K key);
}
