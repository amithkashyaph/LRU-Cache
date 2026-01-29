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
}
