package com.cn.xx.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/19
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        //创建学院
        List<College> colleges = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();


        colleges.add(computerCollege);
        colleges.add(infoCollege);


        OutPutImpl outPut = new OutPutImpl(colleges);

        outPut.printCollege();
    }

}
