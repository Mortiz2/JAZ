package pl.pjatk.krzpro;

import org.springframework.stereotype.Service;

@Service
public class StagingService implements HandlerServiceInterface {

    @Override
    public String getMessage() {
        return "Hello from Staging";
    }
}
