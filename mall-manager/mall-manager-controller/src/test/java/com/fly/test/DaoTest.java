package com.fly.test;

import com.fly.dao.ItemDao;
import com.fly.pojo.Item;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        SqlSessionFactory sessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSession session = sessionFactory.openSession();
        ItemDao itemDao = session.getMapper(ItemDao.class);
        Item item = itemDao.selectByPrimaryKey(605616L);
        System.out.println(item);
        session.close();
    }
}
