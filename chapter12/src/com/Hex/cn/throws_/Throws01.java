package com.Hex.cn.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.PublicKey;

/**
 * @author Hex
 * @version 17
 */
public class Throws01 {
    public static void main(String[] args) {

    }
    public void f1() throws FileNotFoundException {
        //编译异常(FileNotFoundException)处理
        // 异常处理时,try catch和throws二选一
        //1. 可以使用try catch finally
        //2. 可以使用throws,抛出异常,让调用了f1方法的调用者处理
        //3. throws抛出的异常可以是方法中产生的异常也可以是他的父类比如Exception

        FileInputStream fis = new FileInputStream("aa.txt");
    }


}
