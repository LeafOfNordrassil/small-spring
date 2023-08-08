package com.wzzzy.springframework.test;

import com.wzzzy.springframework.BeanDefinition;
import com.wzzzy.springframework.BeanFactory;
import com.wzzzy.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author Wzzzy
 * @since 2023-08-08 16:26
 */
public class ApiTest {
    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
