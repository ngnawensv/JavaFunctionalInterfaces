package offsetdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OffsetDateTimeHandler {

  public static void main(String[] args) {
    OffsetDateTime offsetDateTime1 =OffsetDateTime.now();
    OffsetDateTime offsetDateTime2 =OffsetDateTime.now(ZoneId.of("EST", ZoneId.SHORT_IDS));
    OffsetDateTime offsetDateTime3 =OffsetDateTime.now(ZoneId.of("America/New_York"));
    OffsetDateTime offsetDateTime4 =OffsetDateTime.now(ZoneId.of("Europe/Paris"));
    OffsetDateTime offsetDateTime5 =OffsetDateTime.now(ZoneId.of("EAT", ZoneId.SHORT_IDS));
    OffsetDateTime offsetDateTime6 =OffsetDateTime.now(ZoneId.of("IST", ZoneId.SHORT_IDS));
    System.out.println("offsetDateTime1 : "+offsetDateTime1);
    System.out.println("offsetDateTime2 : "+offsetDateTime2);
    System.out.println("offsetDateTime3 : "+offsetDateTime3);
    System.out.println("offsetDateTime4 : "+offsetDateTime4);
    System.out.println("offsetDateTime5 : "+offsetDateTime5);
    System.out.println("offsetDateTime6 : "+offsetDateTime6);
    System.out.println("*************************************************************************");
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
    ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
    ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
    System.out.println("zonedDateTime : "+zonedDateTime);
    System.out.println("zonedDateTime1 : "+zonedDateTime1);
    System.out.println("zonedDateTime2 : "+zonedDateTime2);
    System.out.println("zonedDateTime3 : "+zonedDateTime3);
    System.out.println("*************************************************************************");
    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDateTime localDateTime1 = LocalDateTime.now(ZoneId.of("America/New_York"));
    LocalDateTime localDateTime2 = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
    LocalDateTime localDateTime3 = LocalDateTime.now(ZoneId.of("Europe/Paris"));
    System.out.println("localDateTime : "+localDateTime);
    System.out.println("localDateTime1 : "+localDateTime1);
    System.out.println("localDateTime2 : "+localDateTime2);
    System.out.println("localDateTime3 : "+localDateTime3);
  }

}
