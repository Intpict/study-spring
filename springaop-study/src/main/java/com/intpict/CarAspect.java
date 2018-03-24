package com.intpict; /**
 * User: linsen
 * Date: 18/3/24
 * Time: 下午8:27
 * Description:
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 切面类
 */
@Aspect
@Component
public class CarAspect {

    @Around("execution(public * com.intpict.*Invoke.*(..))")
    public Object invoke(ProceedingJoinPoint jointPoint) throws Throwable {
        System.out.println("Go test! ");
        // 执行具体流程方法
        Object ret = jointPoint.proceed();
        System.out.println("end test! ");
        System.out.println("--------------------------------------");

        return ret;
    }

}
