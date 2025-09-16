import android.provider.Settings;
import android.content.ContentResolver;

public class Example {
    public void storeUser(ContentResolver contentResolver) {
        String uid = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID); // Sensitive
        User user = new User(
            uid,
            "John",
            "Doe"
        );
    }
    static class User {
        User(String uid, String first, String last) {}
    }
}
