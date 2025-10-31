import java.util.HashMap;

class ProductManager {
  private final HashMap<String, Product> productMap = new HashMap<String, Product>();

  public void addProduct(String article,
                                 String pName,
                                 String pDescription,
                                 double pPrice,
                                 int pQuantity) {
    productMap.put(article, new Product(pName, pDescription, pPrice, pQuantity));
  }
  public void addProduct(String article, Product product) {
    productMap.put(article, product);
  }
  public Product getProduct(String article) {
    return productMap.get(article);
  }
  public Product removeProduct(String article) {
    return productMap.remove(article);
  }
  public void showProducts() {
    System.out.println("Все товары: ");
    for (String article : productMap.keySet()) {
      Product p = productMap.get(article);
      System.out.println(p.toString());
    }
  }
}
