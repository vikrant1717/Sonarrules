import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.JavascriptInterface;
import androidx.appcompat.app.AppCompatActivity;

public class ExampleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new JavaScriptBridge(), "androidBridge"); // Sensitive
    }

    public static class JavaScriptBridge {
        @JavascriptInterface
        public String accessUserData(String userId) {
            return getUserData(userId);
        }
        private String getUserData(String userId) { return "userData"; }
    }
}
