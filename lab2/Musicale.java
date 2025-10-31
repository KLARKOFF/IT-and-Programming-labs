import java.time.LocalDate;

public class Musicale extends Book {
  private String name;
  private String[] actors;
  private String director;

  public String[] getActors() { return this.actors; }
  public void setActors(String[] actors) { this.actors = actors; }

  public String getDirector() { return this.director; }
  public void setDirector(String director) { this.director = director; }

  public String getName() { return this.name; }
  public void setName(String name) { this.name = name; }

  public Musicale() {
    super();
    name = "Unknown";
    actors = new String[0];
    director = "Unknown";
  }
  public Musicale(String name, String director, String[] actors, String title, String author, LocalDate date) {
    super(title, author, date);
    this.name = name;
    this.director = director;
    this.actors = actors;
  }

  @Override
  public void getInfo() {
    System.out.printf("Мьюзикл \"%s\". Постановщик %s\n", name, director);
    System.out.printf("Роли: ");
    for (int i = 0; i < actors.length; i++) {
      System.out.printf("%s ", actors[i]);
    }
  }
}
