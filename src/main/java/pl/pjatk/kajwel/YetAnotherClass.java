package pl.pjatk.kajwel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class YetAnotherClass {
    public YetAnotherClass(ApplicationContext context) {
        System.out.println("YetAnotherClass.YetAnotherClass");

        SomeClass someClass = context.getBean("someClass", SomeClass.class);
        SomeOtherClass someOtherClass = context.getBean("someOtherClass", SomeOtherClass.class);
        someClass.printClassName();
        someOtherClass.printClassName();

        ApplicationContext anotherContext = new ClassPathXmlApplicationContext("Beans.xml");
        YetYetAnotherClass yetYetAnotherClass = anotherContext.getBean("yetYetAnotherClass", YetYetAnotherClass.class);
        yetYetAnotherClass.printClassName();
    }
}
