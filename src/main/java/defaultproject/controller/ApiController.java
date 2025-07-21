package defaultproject.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "service", "default-project");
    }

    @GetMapping("/info")
    public Map<String, Object> info() {
        return Map.of(
            "name", "default-project",
            "version", "1.0.0",
            "description", "Generated project",
            "owner", "Default Team"
        );
    }
}