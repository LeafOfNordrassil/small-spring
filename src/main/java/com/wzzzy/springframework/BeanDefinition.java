package com.wzzzy.springframework;

/**
 * 用于定义 Bean 实例化信息
 * @author Wzzzy
 * @since 2023-08-08 16:13
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
