import org.springframework.web.bind.annotation.*;

@RestController
public class ResourceController {
    @GetMapping("/api/resource/{id}")
    public ResponseEntity<String> getResourceById(Long id) { // Noncompliant - missing @PathVariable
        return ResponseEntity.ok("Fetching resource with ID: " + id);
    }

    @GetMapping("/api/asset/")
    public ResponseEntity<String> getAssetById(@PathVariable Long id) { // Noncompliant - no placeholder in path
        return ResponseEntity.ok("Fetching asset with ID: " + id);
    }
}
