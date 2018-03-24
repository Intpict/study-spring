package com.intpict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * User: linsen
 * Date: 18/3/24
 * Time: 下午8:28
 * Description:
 */

@Component
public class CarInvoke {

    @Autowired
    CarInvoke invoke;

    public void clean() {
        System.out.println("clean my car! ");
    }

    /**
     * 被切1次
     */
    public void drive() {
        clean();
        System.out.println("drive my car! ");
    }

    /**
     * 被切2次
     */
    public void singleDrive() {
        invoke.clean();
        System.out.println("drive my car! ");
    }

    /**
     * 静态方法不被切
     */
    public static void desc() {
        System.out.println("my car is perfect! ");
    }

}
