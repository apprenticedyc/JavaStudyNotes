package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE;

/**
 * @author Hex
 * @version 17
 */
public class Depracated {
    LLLLLLL lllllll = new LLLLLLL();
}

@Deprecated
class LLLLLLL {
}
/**
 * @Documented
 * @Retention(RetentionPolicy.RUNTIME)
 * @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
 * public @interface Deprecated {
 *
 *  boolean forRemoval() default false;
 * }
 */
//@Depracated表示某个元素已经过时,但不代表不能用
//可以是类 方法 字段 包 参数 等等