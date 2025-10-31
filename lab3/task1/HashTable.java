public class HashTable<K, V> {
  private final int default_length = 10;
  private Node<K, V>[] table; 
  private int size;

  private static class Node<K, V> {
    K key;
    V value;
    Node<K, V> next;

    Node(K key, V value, Node<K, V> next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }
  }

  public HashTable(int length) {
    if (length > 0)
      this.table = new Node[length];
    else
      this.table = new Node[default_length];
  }
  public HashTable() {
  this.table = new Node[default_length];
  }

  private int hash(K key) {
    return Math.abs(key.hashCode() % table.length);
  }
  public int getSize() {
    return this.size;
  }
  public boolean isEmpty() {
    return this.size == 0;
  }

  public void put(K key, V value) {
    int index = hash(key);
    Node<K, V> current = table[index];

    while (current != null) {
      if (current.key.equals(key)) {
        current.value = value;
        return;
      }
      current = current.next;
    }

    table[index] = new Node<K,V>(key, value, table[index]);
    size++;
  }
  public V get(K key) {
    int index = hash(key);
    Node<K, V> current = table[index];

    while (current != null) {
      if (current.key.equals(key))
        return current.value;
      current = current.next;
    }

    return null;
  }
  public void remove(K key) {
   int index = hash(key);
    Node<K, V> current = table[index];
    Node<K, V> previous = null;

    while (current != null) {
      if (current.key.equals(key)) {
        if (previous == null)
          table[index] = current.next;
        else
          previous.next = current.next;
        size--;
        return;
      }
      previous = current;
      current = current.next;
    }
  }
  public void show() {
    System.out.println("Key\tValue--------------------------");
    for (int i = 0; i < table.length; i++) {
      System.out.printf("Index: %d\n", i);
      Node<K, V> current = table[i];
      while (current != null) {
        System.out.printf("%s\t%s\n", current.key, current.value);
        current = current.next;        
      }
    }
    System.out.println("End------------------------------------");
  }
}
