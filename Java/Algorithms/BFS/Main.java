/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // Create binary tree with root node equal to 4
        BinaryTree<Integer> tree = new BinaryTree<>(4);

        // Set root's children to 2 and 6, respectively
        tree.root.left = new Node<>(2);
        tree.root.right = new Node<>(6);
        // Set root's left child's children to 1 and 3, respectively
        tree.root.left.left = new Node<>(1);
        tree.root.left.right = new Node<>(3);
        // Set root's right child's children to 5 and 7, respectively
        tree.root.right.left = new Node<>(5);
        tree.root.right.right = new Node<>(7);

        tree.inOrderPrint();
    }
}