package LRU;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K, V> {
    private final int initialCapacity;
    private final Map<K, Node<K, V>> map;
    private final DoublyLinkedList<K, V> linkedList;

    public LRUCache(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        this.map = new HashMap<>(initialCapacity);
        this.linkedList = new DoublyLinkedList<>();
    }

}
