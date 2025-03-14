package pl.pjatk.krzpro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ThirdComponent {
    private static ApplicationContext applicationContext;

    @Autowired
    private void setApplicationContext(ApplicationContext ctx) {
        applicationContext = ctx;
        applicationContext.getBean("firstComponent", FirstComponent.class);
        applicationContext.getBean("secondComponent", SecondComponent.class);
    }
}