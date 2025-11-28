import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите любое число: ");

    try {
      if (!scanner.hasNextInt())
        throw new CustomInputMismatchException(scanner.nextLine());
      else {
        int number = scanner.nextInt();
        System.out.printf("%d действительно является числом!\n", number);
      }
    } catch (CustomInputMismatchException e) {
      scanner.close();
      System.out.println(e.getMessage());
      return;
    }
    scanner.close();
  }
}
