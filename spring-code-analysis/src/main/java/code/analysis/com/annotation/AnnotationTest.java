package code.analysis.com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloAnnotation bean = context.getBean("helloAnnotation", HelloAnnotation.class);
        bean.getMessage();
    }
}
