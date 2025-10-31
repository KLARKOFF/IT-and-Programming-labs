public class Main {
  public static void main(String[] args) {
    HashTable<String, Integer> myHashTable = new HashTable<String, Integer>(17);
    myHashTable.put("Test Key", 114);
    //myHashTable.show();
    myHashTable.put("Orange", 17);
    //myHashTable.show();
    myHashTable.put("Organism", 45);
    myHashTable.show();

    System.out.println("Значение по ключу Orange: " + myHashTable.get("Orange"));
    System.out.println("Значение по ключу asdhkjthkjv: " + myHashTable.get("asdhkjthkjv"));

    myHashTable.remove("Organism");

    System.out.println("Значение по ключу Organism: " + myHashTable.get("Organism"));
    myHashTable.show();

    HashTable<Integer, Boolean> isPrimeTable = new HashTable<Integer, Boolean>(101);
    for (int i = 0; i < 1000; i++) {
      isPrimeTable.put(i, Primes.isPrime(i)); // метод взял из первой лабораторной
    }

    System.out.println("Является ли число 101 простым: " + isPrimeTable.get(101));
  }
}
