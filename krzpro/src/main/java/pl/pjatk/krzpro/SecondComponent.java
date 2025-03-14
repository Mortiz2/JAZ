package pl.pjatk.krzpro;

import org.springframework.stereotype.Component;

@Component
public class SecondComponent {

    public SecondComponent(FirstComponent firstComponent) {
        System.out.println("SecondComponent");
        firstComponent.printName();
    }

    public void printNameAndMethod() {
        System.out.println("SecondComponent from printNameAndMethod method");
    }

}
