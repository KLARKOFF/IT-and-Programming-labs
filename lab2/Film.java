import java.time.LocalDate;

public class Film extends Book {
  private double budget;
  private String director;

  public double getBudget() { return budget; }
  public void setBudget(double budget) { this.budget = budget; }

  public String getDirector() { return director; }
  public void setDirector(String director) { this.director = director; }

  public Film() {
    super();
    this.budget = 0.0;
    this.director = "Unknown";
  }
  public Film(String title, String author, LocalDate publishdate, double budget, String director) {
    super(title, author, publishdate);
    this.director = director;
    this.budget = budget;
  }

  @Override
  public void getInfo() {
    System.out.printf("Фильм режиссёра %s \"%s\".\n", director, getTitle());
    System.out.printf("Премьера состоялась %s.\n", getDate().toString());
    System.out.printf("Бюджет %s", budget);
  }
}
