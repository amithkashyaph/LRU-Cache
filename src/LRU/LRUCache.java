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

    public V get(K key) {
        Node<K, V> node = map.get(key);
        if(node == null) {
            return null;
        }

        linkedList.removeAndMoveToFront(node);
        return node.getValue();
    }

    public void put(K key, V value) {
        Node<K, V> node = map.get(key);
        if(node != null) {
            node.setValue(value);
            linkedList.removeAndMoveToFront(node);
            return;
        }
        if(map.size() == initialCapacity) {
            Node<K, V> removedNode = linkedList.removeLast();
            map.remove(removedNode.getKey());
        }

        Node<K, V> newNode = new Node<>(key, value);
        map.put(key, newNode);
        linkedList.addFront(newNode);

    }

    public void printCache() {
        linkedList.printList();
    }

}
