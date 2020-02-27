package MethodPractice;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DatePractice {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());

        LocalDate date=LocalDate.now();
        // return type of now is LocalDate object.We can assign to our reference type.
        //LocalDate has a constructor but this constructor is private.
        //I can not access out of LocalDate class.
        //LocalDate date1=new LocalDate(); wrong
        //YOu can not create an object using new key word for LocalDate, LocalTime and LocalDateTime.
        System.out.println("date is "+date);
        //of(int year, int month, int date);

        LocalDate date1=LocalDate.of(2020,01,04);
        System.out.println(date1);
        LocalDate date2=LocalDate.of(2020, Month.JANUARY,04);
        System.out.println("new version with object MONTH"+date2);

        LocalTime time=LocalTime.of(1,34);
        System.out.println(time);
        LocalTime time1=LocalTime.of(12,20,40,456789);
        System.out.println(time1);

            //We can not directly dive the value as a LocalDateTime.noe(); because in implementation for "of" method
        // in LocalDateTime there is no "of" method axxept the LocalDateTime as a parameter.
        LocalDateTime dateTime=LocalDateTime.of(2020,Month.JANUARY,04,12,24,22,25987);
        System.out.println(dateTime);
        LocalDateTime dateTime1=LocalDateTime.of(date1,time);
        System.out.println(dateTime1);

        //All time method plusHour,plusMin,plusNanos is available for LocalTime object.
        //All date method plusYear,plusMonth,plusDay is available for LocalDate object
        //all date and time method are available for LocalDateTime.
        LocalDate date3=LocalDate.now();
        date3=date3.plusDays(40);
        System.out.println(date3);
        //date and Time objects are immutable, once you use the method it will  not change your original value.
        //you need to reassign them again.


        LocalDate dob=LocalDate.now();
        dob=dob.minusYears(30).plusMonths(11).plusDays(12);
        System.out.println("This is "+dob);
        Period days= Period.ofDays(20);
        System.out.println(days);
        //After 3 weeks i will get the OCA certificate.
        Period weeks=Period.ofWeeks(3);
        System.out.println(weeks);
        //After one year i will find a job in Google company
        Period month=Period.ofMonths(6);
        System.out.println(month);
        Period yeears=Period.ofYears(1);
        System.out.println(yeears);
        //After one year, six month and 20 days i will go to interview

        Period fulldate=Period.of(1,6,20);
        System.out.println(fulldate);

        Period fullDate1=Period.ofYears(1).ofMonths(6).ofDays(20);
        System.out.println(fullDate1);

        DateTimeFormatter dateFormat=DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(dateFormat.format(LocalDate.now()));

        DateTimeFormatter dateFormatTime=DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(dateFormatTime.format(LocalTime.now()));

        DateTimeFormatter formatTime1=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(formatTime1.format(LocalDateTime.now()));

        DateTimeFormatter dateTimeFormater=DateTimeFormatter.ofPattern("MMMM yyyy,dd|hh:mm");
        dateTimeFormater.format(LocalDateTime.now());
        LocalDateTime time2=LocalDateTime.now();
        System.out.println(dateTimeFormater.format(time2));
        //System.out.println(time2);

        DateTimeFormatter newDay=DateTimeFormatter.ofPattern("yyYY/MMM/dd");
        //We can not use LocalTime.now(); it will throw exception.

        System.out.println(newDay.format(LocalDate.now()));
        LocalDateTime now1=LocalDateTime.now();
        LocalTime timeLocal=LocalTime.now();

        LocalDate now=LocalDate.now();
        DateTimeFormatter format1=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter format2=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter format3=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(format1.format(now));
         System.out.println(format2.format(now));
          System.out.println(format3.format(now));
           System.out.println(format1.format(now1));
            System.out.println(now1);
            //System.out.println(format1.format(timeLocal));
        DateTimeFormatter format4=DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(format4.format(timeLocal));
        System.out.println(format4.format(now1));

        DateTimeFormatter format5=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(format5.format(now1));

        //Define your format
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd MMM yyyy");
        String date4="24 April 2020";
        //Convert String to Date object
//
//        DateTimeFormatter dateTimeFormatter2=DateTimeFormatter.ofPattern("MMMM dd,YYYY");
//        LocalDate localdate=LocalDate.parse(date4,dateTimeFormatter2);
//        System.out.println(dateTimeFormatter2.format(localdate));



        System.out.println();

        String value="4/22/2020";
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate local=LocalDate.parse(value,dt);
        System.out.println(local);
        DateTimeFormatter dt2=DateTimeFormatter.ofPattern("dd MMMM,yyyy");
        System.out.println(dt2.format(local));
        //System.out.println(local.format(dt2));

        String str="15 05 2020 14:33";
        DateTimeFormatter form=DateTimeFormatter.ofPattern("dd MM yyyy HH:mm");
        LocalDateTime local1=LocalDateTime.parse(str,form);
        DateTimeFormatter form2=DateTimeFormatter.ofPattern("M/dd/yyyy-HH:mm");
        System.out.println(form2.format(local1));


    }
}
