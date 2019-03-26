/**
 * BinaryTree
 */
public class BinaryTree<T> {
    Node<T> root;

    // Constructor with value
    BinaryTree(T key) {
        this.root = new Node<T>(key);
    }

    // Overloaded constructor with no value
    BinaryTree() {
        this.root = null;
    }

    void inOrderPrint(Node<T> node) {
        if (node == null) {
            return;
        }
        /* first recur on left child */
        inOrderPrint(node.left);
        /* then print the data of node */
        System.out.println(node.data + " ");
        /* now recur on right child */
        inOrderPrint(node.right);
    }

    void preOrderPrint(Node<T> node) {
        if (node == null) {
            return;
        }
        /* first recur on left child */
        inOrderPrint(node.left);
        /* then print the data of node */
        System.out.print(node.data + " ");
        /* now recur on right child */
        inOrderPrint(node.right);
    }

    void postOrderPrint(Node<T> node) {
        if (node == null) {
            return;
        }
        /* first recur on left child */
        inOrderPrint(node.left);
        /* then print the data of node */
        System.out.print(node.data);
        /* now recur on right child */
        inOrderPrint(node.right);
    }

    // Wrappers over above recursive functions
    void inOrderPrint() {
        inOrderPrint(root);
    }

    void preOrderPrint() {
        preOrderPrint(root);
    }

    void postOrderPrint() {
        postOrderPrint(root);
    }
}