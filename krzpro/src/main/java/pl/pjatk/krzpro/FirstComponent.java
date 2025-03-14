package pl.pjatk.krzpro;

import org.springframework.stereotype.Component;

@Component
public class FirstComponent {

    public void printName() {
        System.out.println("FirstComponent");
    }

    public void printNameAndMethod() {
        System.out.println("FirstComponent from printNameAndMethod method");
    }
}
