package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Hex
 * @version 17
 */
public class Override {
    public static void main(String[] args) {

    }
}

class Father {
    public void fuck() {
        System.out.println("爸爸爱嫖娼");
    }
}

class Son extends Father {

    //如果写了override注解name编译器就会去检查是否真的重写了
    //如果没有构成重写就会报错

    /**
     * 解读:如果发现@interface 表示一个 "注解类"
     *
     * @Target是修饰注解的注解称为元注解
     * @Target(ElementType.METHOD) 表示只能放在方法METHOD上
     * @Retention(RetentionPolicy.SOURCE) public @interface Override {
     * }
     */
    @java.lang.Override
    public void fuck() {
        System.out.println("儿子也爱");
    }
}