package Date_;

import java.time.Instant;
import java.util.Date;

/**
 * @author Hex
 * @version 17
 */
public class Instant_ {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        Instant instant = date.toInstant();
    }
}
