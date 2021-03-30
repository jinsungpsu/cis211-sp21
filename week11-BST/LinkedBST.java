public class LinkedBST<K extends Comparable<K>, V> implements BinarySearchTree<K, V> {
    Node root;

    // This method mainly calls insertRec()
    // Derived from: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
    @Override
    public void insert(K key, V value) {
        root = insertRec(root, key, value);
    }

    public V min() {
        return minRec(root);
    }

    private V minRec(Node root) {
        // base case
        if (root.left == null) {
            // i've reached the end of the line only left...
            return root.value;
        } else {
            // recursive case, just keep going left...
            return minRec(root.left);
        }
    }

    public V max() {
        return null;
    }


    /* A recursive function to
       insert a new key in BST */
    Node insertRec(Node root, K key, V value)
    {

        /* If the tree is empty,
           return a new node */
        if (root == null)
        {
            root = new Node();
            root.key = key;
            root.value = value;
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key.compareTo(root.key) < 0)
            root.left = insertRec(root.left, key, value);
        else if (key.compareTo(root.key) > 0)
            root.right = insertRec(root.right, key, value);

        /* return the (unchanged) node pointer */
        return root;
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

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Contents of this tree are: ");
        return output.toString();

    }

    private class Node {
        K key;
        V value;
        Node left, right;
    }
}
