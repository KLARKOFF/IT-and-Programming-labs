import java.time.LocalDate;
public class AudioBook extends Book {
  private double audiolength;
  private String narrator;

  public double getAudioLength() { return audiolength; }
  public void setAudioLength(double length) { this.audiolength = length; }

  public String getNarrator() { return narrator; }
  public void setNarrator(String narrator) { this.narrator = narrator; }

  public AudioBook() {
    super();
    this.audiolength = 0.0;
    this.narrator = "Unknown";
  }
  public AudioBook(String title, String author, LocalDate publishdate, double audiolength, String narrator) {
    super(title, author, publishdate);
    this.audiolength = audiolength;
    this.narrator = narrator;
  }

  @Override
  public void getInfo() {
    System.out.printf("Аудиокнига %s за авторством %s\n", getTitle(), getAuthor());
    System.out.printf("Дата выпуска: %s\n", getDate().toString());
    System.out.printf("Читает %s\n", narrator);
  }

  public void listen() {
    System.out.printf("Вы начали слушать %s", getTitle());
  }
}
