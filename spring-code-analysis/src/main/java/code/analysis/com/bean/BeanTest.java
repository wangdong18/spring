package code.analysis.com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        HelloBean obj = (HelloBean) context.getBean("helloWorld");
        obj.getMessage();
    }
}
