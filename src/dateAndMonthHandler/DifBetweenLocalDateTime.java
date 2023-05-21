package dateAndMonthHandler;

import java.time.Duration;
import java.time.LocalDateTime;

public class DifBetweenLocalDateTime {
  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDateTime localDateTimeOneMonthEgo = localDateTime.minusMonths(1);
    System.out.println("localDateTime "+localDateTime);
    System.out.println("localDateTimeOneMonthEgo "+localDateTimeOneMonthEgo);
    Duration duration = Duration.between(localDateTimeOneMonthEgo, localDateTime);

    // days between from and to
    System.out.println(duration.toDays() + " days");

    // hours between from and to
    System.out.println(duration.toHours() + " hours");

    // minutes between from and to
    System.out.println(duration.toMinutes() + " minutes");

    // seconds between from and to
    System.out.println(duration.toSeconds() + " seconds");
    System.out.println(duration.getSeconds() + " seconds");

    String localDateTimeString = LocalDateTime.now().toString();
    System.out.println("localDateTimeString "+localDateTimeString);
    LocalDateTime dateTimeParse = LocalDateTime.parse(localDateTimeString);
    System.out.println("dateTimeParse "+dateTimeParse);

  }
}
