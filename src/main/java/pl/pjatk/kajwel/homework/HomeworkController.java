package pl.pjatk.kajwel.homework;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/homework")
public class HomeworkController {
    @GetMapping(value = {"/slug-or-param", "/slug-or-param/{slug}"})
    public ResponseEntity<String> getSlugOrParamValue(
            @PathVariable(name = "slug", required = false) Optional<String> slug,
            @RequestParam(name = "value", required = false) Optional<String> param
    ) {
        return slug.map(ResponseEntity::ok).orElseGet(() -> param.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build()));
    }
}
