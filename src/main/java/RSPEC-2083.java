import org.springframework.web.bind.annotation.*;
import java.io.File;

@Controller
public class ExampleController {
    private static String targetDirectory = "/path/to/target/directory/";

    @GetMapping(value = "/delete")
    public void deleteFile(@RequestParam("filename") String fileName) {
        File file = new File(targetDirectory + fileName); // Noncompliant: path injection vulnerability
        file.delete();
    }
}
