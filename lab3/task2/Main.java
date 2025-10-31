import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    ProductManager manager = new ProductManager();
    manager.addProduct("Ф001", new Product("Яблоко", "Красные яблочки, цена за килограмм", 120.00, 40));
    manager.addProduct("Ф002", new Product("Апельсин", "Обычные апельсины, цена за килограмм", 170.00, 50));
    manager.addProduct("Ж001", new Product("Молоко", "Молоко простоквашино 900 л", 93.00, 12));

    System.out.println("Существует ли продукт с артикулом Ф002:" + (manager.getProduct("Ф002") != null));
    System.out.println("Существует ли продукт с артикулом А002:" + (manager.getProduct("А002") != null));

    manager.showProducts();
  }
}
