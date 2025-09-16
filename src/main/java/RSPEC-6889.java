import android.os.PowerManager;
import android.media.MediaPlayer;
import android.hardware.SensorManager;
import android.hardware.Sensor;

public class Example {
    public void methodWakeLock() {
        PowerManager powerManager = (PowerManager) getSystemService(POWER_SERVICE);
        PowerManager.WakeLock wakeLock = powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "My Wake Lock");
        wakeLock.acquire(); // Noncompliant: missing wakeLock.release()
        // do some work...
    }

    public void methodMediaPlayer() {
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.sound_file_1);
        mediaPlayer.start(); // Noncompliant: missing mediaPlayer.release()
        // do some work...
    }

    public void methodSensorManager() {
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL); // Noncompliant: missing sensorManager.unregisterListener(this)
        // do some work...
    }
}
