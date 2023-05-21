package dateAndMonthHandler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class DateAndMonth {

  public static void main(String[] args) {
    LocalDate mydate = LocalDate.of(2023,05,01);// Or whatever you want
    LocalDate mydate1 = mydate.minusMonths(1);
    System.out.println("mydate "+mydate);
    System.out.println("mydate1 "+mydate1);

    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDateTime localDateTime1 = localDateTime.minusMonths(1);
    LocalDateTime localDateTimeFrom = LocalDateTime.of(2023,05,01,0,0);
    LocalDateTime localDateTimeFrom1 = localDateTimeFrom.minusMonths(1);
    System.out.println("localDateTime "+localDateTime);
    System.out.println("localDateTime1 "+localDateTime1);
    System.out.println("localDateTimeFrom "+localDateTimeFrom);
    System.out.println("localDateTimeFrom1 "+localDateTimeFrom1);

    List<Stat> statList =List.of(new Stat(1L, "Test 1", LocalDate.of(2023,05,19)),
        new Stat(2L, "Test 2", LocalDate.of(2023,05,19)),
        new Stat(3L, "Test 3", LocalDate.of(2023,05,19)),
        new Stat(4L, "Test 4", LocalDate.of(2023,05,19)),
        new Stat(5L, "Test 5", LocalDate.of(2023,05,19)),
        new Stat(6L, "Test 6", LocalDate.of(2023,05,19)));
    System.out.println("statList {}: "+statList);
    System.out.println("LocalDate.of(2023,05,19).minusMonths(1): "+LocalDate.of(2023,05,19).minusMonths(1));
    System.out.println("LocalDate.of(2023,05,19): "+LocalDate.of(2023,05,19));
    List<Stat> statListFilter=statList.stream()
        .filter(stat -> stat.localDate.isBefore(LocalDate.of(2023,05,19).plusDays(1))&&stat.localDate.isAfter(LocalDate.of(2023,04,19).minusMonths(1).plusDays(1)))
        .collect(Collectors.toList());
    System.out.println("statListFilter {}: "+statListFilter);
    Long statCount =statListFilter.stream().count();
    System.out.println("statCount: "+statCount);
  }
  static class  Stat{
    private long id;
    private String name;
    private LocalDate localDate;

    Stat(long id, String name, LocalDate localDate) {
      this.id = id;
      this.name = name;
      this.localDate = localDate;
    }

    @Override
    public String toString() {
      return "Stat{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", localDate=" + localDate +
          '}';
    }
  }
}
