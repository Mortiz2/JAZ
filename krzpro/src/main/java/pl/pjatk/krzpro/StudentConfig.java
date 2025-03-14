package pl.pjatk.krzpro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    public Student getStudent() {
        return new Student();
    }

    @Bean
    public List<String> defaultData() {
        return List.of("Jeden", "Dwa", "Trzy", "Cztery", "Pięć");
    }

    @Bean
    public String newBean(@Value("${my.custom.property:Default Value}") String newBean) {
        System.out.println(newBean);
        return newBean;
    }

    @Bean
    @ConditionalOnProperty(name = "app.myProperty", havingValue = "true")
    public Student student() {
        return new Student();
    }
}
