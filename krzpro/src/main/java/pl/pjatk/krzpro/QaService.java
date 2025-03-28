package pl.pjatk.krzpro;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class QaService implements HandlerServiceInterface {

    @Override
    public String getMessage() {
        return "Hello from QA";
    }
}
