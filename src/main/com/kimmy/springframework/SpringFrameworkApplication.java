package main.com.kimmy.springframework;

import main.com.kimmy.springframework.dao.TestDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import java.lang.reflect.TypeVariable;

public class SpringFrameworkApplication {

    public static void main(String[] args) {
//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("F:\\workspaces\\workspace_spring\\springFramework\\src\\resources\\application.xml"));
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("F:\\workspace\\workspace_spring\\springFramework\\src\\resources\\application.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources\\application.xml");

        ApplicationContext applicationContext2 = new FileSystemXmlApplicationContext("F:\\workspace\\workspace_spring\\springFramework\\src\\resources\\application.xml");

        TestDao testDao = (TestDao) applicationContext.getBean("testDao");
        TestDao testDao2 = (TestDao) applicationContext.getBean("testDao");
        TestDao testDaoT = (TestDao) applicationContext2.getBean("testDao");
        TestDao testDaoT2 = (TestDao) applicationContext2.getBean("testDao");
        System.out.println(testDao);
        System.out.println(testDao2);
        System.out.println(testDaoT);
        System.out.println(testDaoT2);
        testDao.add();

        System.out.println("-----------------");
        System.out.println(applicationContext.getId());
        System.out.println(applicationContext.getApplicationName());
        System.out.println(applicationContext.getDisplayName());

        System.out.println("-----------------");
        TypeVariable<Class<TestTypeVariable>>[] typeParameters = TestTypeVariable.class.getTypeParameters();
        System.out.println(typeParameters.length);
    }

    class TestTypeVariable<K,V,T,S>{

    }
}
