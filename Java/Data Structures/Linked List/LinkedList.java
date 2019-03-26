/**
 * LinkedList
 */

public class LinkedList<T> {

    LinkedList() {
        this.data = null;
    }

    /**
     * @return the stuff
     */
    public T getStuff() {
        return stuff;
    }

    public class Node {
        private int data;

        Node(Node nextNode, int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        LinkedList<Integer> test = new LinkedList<>(2);
        System.out.println(test.stuff);
        System.out.println(test.getStuff());
    }
}