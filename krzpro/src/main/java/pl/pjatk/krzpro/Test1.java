package pl.pjatk.krzpro;

import org.springframework.stereotype.Service;

@Service
public class Test1 {
    public Test1(ConfigProperties configProperties) {
        System.out.println(configProperties.getLoginUrl());
        System.out.println(configProperties.getCredentials().getUser());
        System.out.println(configProperties.getCredentials().getPassword());
    }
}
