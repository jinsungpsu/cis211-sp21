public class LinkedBST<K extends Comparable<K>, V> implements BinarySearchTree<K, V> {
    Node root;

    @Override
    public void insert(K key, V value) {

    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public V search(K key) {
        return search(root, key);
    }

    // this root is the root of the current subtree
    private V search(Node root, K key) {
        // from https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
        // Base Cases: root is null or key is present at root
        if (root==null || root.key.compareTo(key)==0)
            return root.value;

        // Key is greater than root's key
        if (root.key.compareTo(key) > 0)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }

    private class Node {
        K key;
        V value;
        Node left, right;
    }
}
