package dates;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

//https://stackoverflow.com/questions/24114155/how-to-get-current-date-and-add-five-working-days-in-java
public class BusinessDays {

  private static  final List<Integer> NON_BUSINESS_DAYS = Arrays.asList(Calendar.SATURDAY,Calendar.SUNDAY);

  public static Date businessDaysFrom(Date date, int businessDays) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    int j=0;
    while (j < Math.abs(businessDays)){
      // here, all days are added/subtracted
      calendar.add(Calendar.DAY_OF_MONTH,  1);

      // but at the end it goes to the correct week day.
      // because i is only increased if it is a week day
      if (!NON_BUSINESS_DAYS.contains(calendar.get(Calendar.DAY_OF_WEEK))){
        j++;
      }
    }

    /*for (int i = 0; i < Math.abs(businessDays);) {
      // here, all days are added/subtracted
      calendar.add(Calendar.DAY_OF_MONTH, businessDays > 0 ? 1 : -1);

      // but at the end it goes to the correct week day.
      // because i is only increased if it is a week day
      if (!NON_BUSINESS_DAYS.contains(calendar.get(Calendar.DAY_OF_WEEK))){
        i++;
      }
    }*/

    return calendar.getTime();
  }

  public static void main(String...strings) {
    SimpleDateFormat s = new SimpleDateFormat("MM.dd.yyyy HH:mm:ss");

    Date date = new Date();
    int businessDays = 7;

    System.out.println(s.format(date));

    System.out.print("+ " + businessDays + " Business Days = ");
    System.out.println(s.format(businessDaysFrom(date, businessDays)));

    System.out.print("- " + businessDays + " Business Days = ");
    System.out.println(s.format(businessDaysFrom(date, -1 * businessDays)));
  }

}
