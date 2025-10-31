class Product {
  private String name;
  private String description;
  private double price;
  private int quantity;

  public String getName() { return name; }
  public String getDesc() { return description; }
  public double getPrice() { return price; }
  public int getQuantity() { return quantity; }

  public void setName(String name) { this.name = name; }
  public void setDesc(String description) { this.description = description; }
  public void setPrice(double price) { this.price = price; }
  public void setQuantity(int quantity) { this.quantity = quantity; }

  @Override
  public String toString() {
      return String.format("Название: %s | Описание: %s | Цена: %.2f | На складе: %d", 
              name, description, price, quantity);
  }

  public Product(String name, String description, double price, int quantity) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }
}
