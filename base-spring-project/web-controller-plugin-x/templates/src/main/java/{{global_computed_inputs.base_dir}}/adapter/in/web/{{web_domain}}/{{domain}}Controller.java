package {{global_computed_inputs.root_package}}.adapter.in.web.{{web_domain}};

import {{global_computed_inputs.root_package}}.adapter.in.web.{{web_domain}}.dto.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("{{controller_base_path}}/")
@RequiredArgsConstructor
public class {{domain}}Controller {

    @PostMapping(path = "{{web_domain}}s/{id}")
    public ResponseEntity<String> post{{domain}}(@RequestBody {{domain}}Dto dto) {
        log.info("POST {{web_domain}} received: {}", dto);
        return ResponseEntity.ok("OK");
    }

    @GetMapping(path = "{{web_domain}}s/{id}")
    public ResponseEntity<{{domain}}Dto> get{{domain}}(@PathVariable("id") String id) {
        log.info("GET {{web_domain}} by id: {}", id);
        return ResponseEntity.ok({{domain}}Dto.builder()
                .id(id)
                .build());
    }
}
