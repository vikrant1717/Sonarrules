import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SurfaceView surfaceView = findViewById(R.id.my_surface_view);
        Surface surface = surfaceView.getHolder().getSurface();

        surface.setFrameRate(90.0f, Surface.FRAME_RATE_COMPATIBILITY_FIXED_SOURCE); // Noncompliant
    }
}
