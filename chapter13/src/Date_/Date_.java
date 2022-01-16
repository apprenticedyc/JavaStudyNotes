package Date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Hex
 * @version 17
 */
public class Date_ {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        Date date = new Date();//获取当前系统时间
        String format = sdf.format(date);
        System.out.println(format);
        String s ="1996年1月01日 12:11:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println(parse);
    }
}
