package dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeClass {

  private static final String DATE_FORMAT = "MM.dd.yyyy HH:mm:ss";
  private static final DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
  private static final DateTimeFormatter dateFormat8 = DateTimeFormatter.ofPattern(DATE_FORMAT);

  public static void main(String[] args) throws ParseException {

    // convert date to localdatetime
    LocalDateTime localDateTime = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    System.out.println("localDateTime : " + dateFormat8.format(localDateTime));

    // convert LocalDateTime to date
    Date currentDatePlus7Days = Date.from(localDateTime.plusDays(7).atZone(ZoneId.systemDefault()).toInstant());
    System.out.println("currentDatePlus7Days : " + dateFormat.format(currentDatePlus7Days));


    // docs https://www.epochconverter.com/
    long currentTimeMillis= System.currentTimeMillis();
    System.out.println("currentTimeMillis >>>>>>>>>>>>> : " + currentTimeMillis);

    String formattedDate = new SimpleDateFormat(DATE_FORMAT).format(currentDatePlus7Days);
    long currentTimeMillisPlus7days = new SimpleDateFormat(DATE_FORMAT).parse(formattedDate).getTime();
    System.out.println("currentTimeMillisPlus7days>>>>>>>>>>>" + currentTimeMillisPlus7days);
  }

}
