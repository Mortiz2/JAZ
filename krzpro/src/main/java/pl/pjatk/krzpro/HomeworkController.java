package pl.pjatk.krzpro;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkController {
    @GetMapping("/get/{var}")
    ResponseEntity<HomeworkResponse> getPath(@PathVariable String var) {
        HomeworkResponse entity = new HomeworkResponse(var);
        return ResponseEntity.ok(entity);
    }

    @GetMapping("/get")
    ResponseEntity<HomeworkResponse> getParam(@RequestParam(required = true) String var) {
        HomeworkResponse entity = new HomeworkResponse(var);
        return ResponseEntity.ok(entity);
    }

    @PostMapping
    ResponseEntity<HomeworkResponse> create(@RequestBody HomeworkRequest request) {
        HomeworkResponse entity = new HomeworkResponse(request.getVar());
        return ResponseEntity.ok(entity);
    }

    @PutMapping("/{id}")
    ResponseEntity<HomeworkResponse> update(@PathVariable String id, @RequestBody HomeworkRequest request) {
        HomeworkResponse response = new HomeworkResponse(request.getVar());
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }
}
