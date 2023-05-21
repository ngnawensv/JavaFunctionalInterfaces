package dateAndMonthHandler;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 1-Period to calculate the difference between two LocalDate.
 2-Duration to calculate the difference between two LocalDateTime.
 3-ChronoUnit for everything.
 * **/
public interface PeriodeDurationChronoUnit {
  public static void main(String[] args) {

   // LocalDate from = LocalDate.of(2020, 5, 4);
    //LocalDate to = LocalDate.of(2020, 10, 10);
    LocalDate to = LocalDate.now();
    LocalDate from = to.minusMonths(1);

    Period period = Period.between(from, to);

    System.out.print(period.getYears() + " years,");
    System.out.print(period.getMonths() + " months,");
    System.out.print(period.getDays() + " days");

    System.out.println("==========================================================");

    LocalDateTime from1 = LocalDateTime.of(2023, 10, 4, 10, 20, 55);
    LocalDateTime to1 = LocalDateTime.of(2023, 10, 10, 10, 21, 1);

    Duration duration = Duration.between(from1, to1);

    // days between from and to
    System.out.println(duration.toDays() + " days");

    // hours between from and to
    System.out.println(duration.toHours() + " hours");

    // minutes between from and to
    System.out.println(duration.toMinutes() + " minutes");

    // seconds between from and to
    System.out.println(duration.toSeconds() + " seconds");
    System.out.println(duration.getSeconds() + " seconds");

    System.out.println("==========================================================");
    LocalDateTime from2 = LocalDateTime.of(2023, 10, 4, 10, 20, 55);
    LocalDateTime to2 = LocalDateTime.of(2023, 11, 10, 10, 21, 1);

    long years = ChronoUnit.YEARS.between(from2, to2);
    long months = ChronoUnit.MONTHS.between(from2, to2);
    long weeks = ChronoUnit.WEEKS.between(from2, to2);
    long days = ChronoUnit.DAYS.between(from2, to2);
    long hours = ChronoUnit.HOURS.between(from2, to2);
    long minutes = ChronoUnit.MINUTES.between(from2, to2);
    long seconds = ChronoUnit.SECONDS.between(from2, to2);
    long milliseconds = ChronoUnit.MILLIS.between(from2, to2);
    long nano = ChronoUnit.NANOS.between(from2, to2);

    System.out.println(years + " years");
    System.out.println(months + " months");
    System.out.println(weeks + " weeks");
    System.out.println(days + " days");
    System.out.println(hours + " hours");
    System.out.println(minutes + " minutes");
    System.out.println(seconds + " seconds");
    System.out.println(milliseconds + " milliseconds");
    System.out.println(nano + " nano");
  }

}
