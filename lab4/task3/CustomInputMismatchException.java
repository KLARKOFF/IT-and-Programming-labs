import java.util.InputMismatchException;

public class CustomInputMismatchException extends InputMismatchException {
  String MismatchedInput;
  public CustomInputMismatchException(String MismatchedInput) {
    super(MismatchedInput + " не является числом!");
    this.MismatchedInput = MismatchedInput;
  }
}
