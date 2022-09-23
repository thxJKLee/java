import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * _003Calendar
 */
public class _003Calendar {

    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        System.out.printf("%d년%d월%d일 %s %d:%d:%d\n",
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH) + 1,
                today.get(Calendar.DATE),
                today.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM",
                today.get(Calendar.HOUR),
                today.get(Calendar.MINUTE),
                today.get(Calendar.SECOND));
        System.out.println();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년M월d일 a hh:mm:ss");
        String result = sdf.format(today.getTime());
        System.out.println(result);
        System.out.println();

        today.add(Calendar.DATE, 10000);
        System.out.println(sdf.format(today.getTime()));
        System.out.println();

        GregorianCalendar A = new GregorianCalendar(2021, 01, 01);
        // 이거는 이제 사용자로부터 받아내는 형식으로 하면 활용할 수 있을 듯.
        GregorianCalendar B = new GregorianCalendar();
        long diff = B.getTimeInMillis() - A.getTimeInMillis();
        long days = diff / 1000 / 60 / 60 / 24;
        System.out.println(days);
        System.out.println();

        // LocalDate 와 LocalTime
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2122, 11, 5));
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.of(22, 11, 5));

        LocalDate today1 = LocalDate.now();
        LocalDate after100 = today1.plusDays(100);
        System.out.println(today1);
        System.out.println(after100);
    }
}