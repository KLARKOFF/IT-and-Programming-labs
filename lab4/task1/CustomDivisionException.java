class CustomDivisionException extends Exception {
  public CustomDivisionException(String message) {
    System.out.println("Деление на ноль!");
    super(message);
  }
}

