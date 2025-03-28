package pl.pjatk.krzpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = MessageController.class)
public class KrzproApplication {

    public static void main(String[] args) {
        SpringApplication.run(KrzproApplication.class, args);
    }

}
