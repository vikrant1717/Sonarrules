import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String username = ((EditText) findViewById(R.id.username)).getText().toString();
        String password = ((EditText) findViewById(R.id.password)).getText().toString();

        Log.i("LoginAttempt", "Login attempt: " + username + " with password: " + password); // Noncompliant
    }
}
