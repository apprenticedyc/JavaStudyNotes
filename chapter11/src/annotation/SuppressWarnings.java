package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author Hex
 * @version 17
 */
@java.lang.SuppressWarnings({"unused"})
public class SuppressWarnings {
    public static void main(String[] args) {
    int a;

    }
}

//当我们不希望看到警告的时候可以使用SuppressWarnings来抑制警告信息
//在{""}中,写入不希望看见的警告信息
//作用范围和写的位置有关,写在main方法,作用范围就是main方法
/**@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
@Retention(RetentionPolicy.SOURCE)
public @interface SuppressWarnings {

String[] value();
}
 */