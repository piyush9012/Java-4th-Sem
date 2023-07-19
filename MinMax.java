public class MinMax {
    class Node {     // Represent a node of the doubly linked list
        int data;
        Node prev, next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head, tail = null;

    public void addNode(int data) { // addNode() will add a node to the list
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.prev = tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public int minNode() { // Find the minimum node
        Node current = head;
        int min;
        if (head == null) {
            System.out.println("List is empty");
            return 0;
        } else {
            min = head.data;
            while (current != null) {
                if (min > current.data)
                    min = current.data;
                current = current.next;
            }
        }
        return min;
    }

    public int maxNode() { // Find the maximum node
        Node current = head;
        int max;
        if (head == null) {
            System.out.println("List is empty");
            return 0;
        } else {
            max = head.data;
            while (current != null) {
                if (current.data > max)
                    max = current.data;
                current = current.next;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MinMax dList = new MinMax();
        dList.addNode(5);
        dList.addNode(7);
        dList.addNode(9);
        dList.addNode(1);
        dList.addNode(2);
        System.out.println("Minimum value node in the list: " + dList.minNode());
        System.out.println("Maximum value node in the list: " + dList.maxNode());
    }
}
