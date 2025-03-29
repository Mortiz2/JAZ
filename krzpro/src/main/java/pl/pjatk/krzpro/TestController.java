package pl.pjatk.krzpro;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/value/{someValue}")
    ResponseEntity<String> getSomeValue(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/model")
    ResponseEntity<Car> getCar() {
        Car car = new Car("Mazda", 123456);
        return ResponseEntity.ok(car);
    }

    @GetMapping("/value")
    ResponseEntity<String> getSomeValueWithParam(@RequestParam(required = true) String reqParam) {
        return ResponseEntity.ok(reqParam);
    }

    @PostMapping("/model")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {

        return ResponseEntity.ok(car);
    }

}

