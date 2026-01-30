package LRU;

public class DoublyLinkedList<K, V> {
    private final Node<K, V> head;
    private final Node<K, V> tail;

    public DoublyLinkedList() {
        this.head = new Node<>(null, null);
        this.tail = new Node<>(null, null);

        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public void addFront(Node<K, V> node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public Node<K, V> removeLast() {
        Node<K, V> node = tail.prev;
        node.prev.next = tail;
        tail.prev = node.prev;

        node.prev = null;
        node.next = null;

        return node;
    }

    public void removeAndMoveToFront(Node<K, V> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;

        addFront(node);
    }

    public void printList() {
        Node<K, V> node = head.next;
        while(node.next != null) {
            System.out.print(node.getValue() + " --> ");
            node = node.next;
        }
        System.out.println();

    }
}
