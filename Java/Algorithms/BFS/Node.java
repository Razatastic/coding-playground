/**
 * Node
 */
public class Node<T> {
    Node<T> left, right;
    T data;

    Node(T data) {
        this.data = data;
        this.left = this.right = null;
    }
}