package com.atguigu.spring.aop.xml;

import org.springframework.stereotype.Component;

/**
 * Date:2022/7/5
 * Author:ybc
 * Description:
 */
@Component
public class ValidateAspect {

    public void beforeMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }

}
