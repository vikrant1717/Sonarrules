import org.springframework.context.annotation.*;

@Configuration
class Config {
    @Bean
    public User user() {
        return currentUser();
    }
    @Bean
    public User user(AuthService auth) { // Noncompliant: duplicate bean name
        return auth.user();
    }
    User currentUser() { return new User(); }
    static class User {}
    static class AuthService {
        User user() { return new User(); }
    }
}
