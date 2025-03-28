package pl.pjatk.krzpro;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdService implements HandlerServiceInterface {

    @Override
    public String getMessage() {
        return "Hello from Prod";
    }
}
