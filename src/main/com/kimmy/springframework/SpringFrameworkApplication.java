package main.com.kimmy.springframework;

import main.com.kimmy.springframework.dao.TestDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringFrameworkApplication {

    public static void main(String[] args) {
//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("F:\\workspaces\\workspace_spring\\springFramework\\src\\resources\\application.xml"));
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("F:\\workspaces\\workspace_spring\\springFramework\\src\\resources\\application.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources\\application.xml");


        TestDao testDao = (TestDao) applicationContext.getBean("testDao");
        TestDao testDao2 = (TestDao) applicationContext.getBean("testDao");
        System.out.println(testDao);
        System.out.println(testDao2);
        testDao.add();

    }
}
