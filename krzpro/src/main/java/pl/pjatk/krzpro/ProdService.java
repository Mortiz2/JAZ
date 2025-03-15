package pl.pjatk.krzpro;

import org.springframework.stereotype.Service;

@Service
public class ProdService implements HandlerServiceInterface {

    @Override
    public String getMessage() {
        return "Hello from Prod";
    }
}
