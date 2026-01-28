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

}
