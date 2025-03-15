package pl.pjatk.krzpro;

import org.springframework.stereotype.Service;

@Service
public class QaService implements HandlerServiceInterface {

    @Override
    public String getMessage() {
        return "Hello from QA";
    }
}
