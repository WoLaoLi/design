package com.cn.xx.jdksrc;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/11
 * @description :
 */
public class Decorator {

    public static void main(String[] args) throws IOException {
        //1 inputstrean是抽象类 类似drink
        //2 FileInputStream 是inputStream子类 类似DeCaf,LongBalk
        //3 FilterInputStream 是inputStream子类  类似Decorator 修饰者
        //DataInputStream 是 filterInpuStream子类  具体的修饰者 类似Milk
        //FilterInputStream 有 pritected volatile InputStream  即被装饰者
        //jdk  io 体系中 就是是用了装饰者
        DataInputStream dsi = new DataInputStream(new FileInputStream("d://abc.txt"));

        System.out.println(dsi.read());

        dsi.close();
    }

}
