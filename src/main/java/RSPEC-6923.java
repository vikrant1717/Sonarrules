import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.content.Context;

public class BackGroundActivity extends Activity {
    private Sensor motionSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SensorManager sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        motionSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR); // Noncompliant
        // ..
    }
    //..
}
