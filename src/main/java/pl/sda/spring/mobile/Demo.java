package pl.sda.spring.mobile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by RENT on 2017-08-10.
 */
public class Demo {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MobileConfiguration.class);
        Samsung firstPhone = context.getBean("samsung", Samsung.class);
        Phone iPhone = context.getBean("iphone", Phone.class);
        Tablet tablet = context.getBean("tablet", Tablet.class);
        tablet.display();
        firstPhone.display();
        iPhone.display();
    }
}
