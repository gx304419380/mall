package com.fly.test;

import com.fly.pojo.Item;
import com.fly.service.ItemService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        ItemService itemService = (ItemService) context.getBean("itemService");
        Item item = itemService.selectByPrimaryKey(536563L);
        System.out.println(item);
    }
}
