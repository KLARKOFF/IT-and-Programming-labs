import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите два числа: ");
                           
    double input[] = Arrays.stream(scanner.nextLine().split(" "))
                           .map(String::trim)
                           .mapToDouble(Double::parseDouble)
                           .toArray();

    double result = 0;

    try {
      if (input[1] == 0)
        throw new CustomDivisionException("");
      else {
        result = input[0] / input[1];
        System.out.printf("Ответ: %f\n", result);
      }
    } catch (CustomDivisionException e) {
      System.out.println("Нельзя делить на ноль!");
    } catch (Exception e) {
      System.out.println("Ошибка ввода.");
    }

    scanner.close();
  }
}
