package com.itheima;

import com.itheima.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    @Test
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);

        String[] names = context.getBeanDefinitionNames();
        for (String str:names){
            System.out.println(str);
        }
    }
}
