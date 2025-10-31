import java.time.LocalDate;

abstract class Book {
  private String title;
  private String author;
  private LocalDate publishdate;
  private static int counter = 0;

  public String getTitle() { return title; }
  public void setTitle(String title) { this.title = title; }

  public String getAuthor() { return author; }
  public void setAuthor(String author) { this.author = author; }

  public LocalDate getDate() { return publishdate; }

  public static int getCount() { return counter; }

  public Book() {
    this.title = "Unknown";
    this.author = "Unknown";
    this.publishdate = LocalDate.now();

    counter++;
  }
  public Book(String title, String author, LocalDate date) {
    this.title = title;
    this.author = author;
    this.publishdate = date;

    counter++;
  }

  public abstract void getInfo();
  
  public void read() {
    System.out.printf("Сейчас вы читаете %s за авторством %s\n", title, author);
  }
}
