package Date_;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Hex
 * @version 17
 */
public class LocalDateTime_ {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH-mm-ss :E");
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);


        LocalDateTime localDateTime1 = localDateTime.plusDays(890);
        System.out.println(dateTimeFormatter.format(localDateTime1));
        LocalDateTime localDateTime2 = localDateTime.minusMinutes(10);
        System.out.println(dateTimeFormatter.format(localDateTime2));


    }
}

