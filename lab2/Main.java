import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    AudioBook Roadside_Picnic = new AudioBook("Roadside Picnic", 
                                              "Strugatsky brothers", 
                                              LocalDate.of(1971, 1, 1), 
                                              5.07, 
                                              "Arkady Strugatsky");
    Film Stalker = new Film("Stalker",
                            "Strugatsky brothers",
                            LocalDate.of(1980, 05, 19),
                            1000000,
                            "Andrei Tarkovsky");
    Roadside_Picnic.getInfo();
    System.out.printf("На этой книге был также основан замечательный фильм:\n");
    Stalker.getInfo();
  }
}
