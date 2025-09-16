import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

public class LocationsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // ...
        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE); // Noncompliant

        LocationListener locationListener = new LocationListener() {
            public void onLocationChanged(Location location) {
                // Use the location object as needed
            }
        };

        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
    }
}
