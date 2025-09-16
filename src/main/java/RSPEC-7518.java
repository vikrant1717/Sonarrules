import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/example")
public class ExampleController {
    private final OpenAIClient client;
    @PostMapping("/example")
    public ResponseEntity<?> example(@RequestBody Map<String, String> payload) {
        String promptText = payload.get("prompt_text");
        String systemText = payload.get("sys_text");
        String developerText = payload.get("dev_text");
        ChatCompletionCreateParams request = ChatCompletionCreateParams.builder()
            .model(ChatModel.GPT_3_5_TURBO)
            .maxCompletionTokens(2048)
            .addSystemMessage(systemText)
            .addDeveloperMessage(developerText)
            .addUserMessage(promptText)
            .build();
        var completion = client.chat().completions().create(request);
        return ResponseEntity.ok(
            Map.of(
                "response",
                completion.choices().stream()
                    .flatMap(choice -> choice.message().content().stream())
                    .collect(Collectors.joining(" | "))
            )
        );
    }
}
class OpenAIClient {
    Chat chat() { return new Chat(); }
    class Chat {
        Completions completions() { return new Completions(); }
        class Completions {
            Completion create(ChatCompletionCreateParams params) { return new Completion(); }
        }
    }
}
class ChatCompletionCreateParams {
    static Builder builder() { return new Builder(); }
    static class Builder {
        Builder model(Object m) { return this; }
        Builder maxCompletionTokens(int t) { return this; }
        Builder addSystemMessage(String s) { return this; }
        Builder addDeveloperMessage(String s) { return this; }
        Builder addUserMessage(String s) { return this; }
        ChatCompletionCreateParams build() { return new ChatCompletionCreateParams(); }
    }
}
class ChatModel {
    static Object GPT_3_5_TURBO = null;
}
class Completion {
    java.util.List<Choice> choices() { return java.util.Collections.emptyList(); }
    class Choice {
        java.util.List<Message> message() { return java.util.Collections.emptyList(); }
    }
    class Message {
        java.util.List<String> content() { return java.util.Collections.emptyList(); }
    }
}
