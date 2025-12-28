package 豆包;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DaoJiShi {
    public static void main(String[] args) {
//        LocalDateTime dateTime1 = LocalDateTime.of(2024, 10, 15, 12, 30, 0);
//        System.out.println("指定具体日期和时间: " + dateTime1);
//
//        // 指定年、月、日、时、分
//        LocalDateTime dateTime2 = LocalDateTime.of(2024, 10, 15, 12, 30);
//        System.out.println("指定日期、小时和分钟: " + dateTime2);
        String starstr ="2024-03-14  12:00:00";
        String endstr ="2024-03-14  15:00:00";
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");
        LocalDateTime start = LocalDateTime.parse(starstr,sdf);
        LocalDateTime end = LocalDateTime.parse(endstr,sdf);
        System.out.println(start);
        System.out.println(end);
        long hoursDiff = ChronoUnit.HOURS.between(end,start);
        long minutesDiff = ChronoUnit.MINUTES.between(end,start);
        long secondsDiff = ChronoUnit.SECONDS.between(end,start);

        // 输出结果
        System.out.println("相差的小时数: " + hoursDiff);
        System.out.println("相差的分钟数: " + minutesDiff);
        System.out.println("相差的秒数: " + secondsDiff);



    }
}
