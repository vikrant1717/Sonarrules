import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public class AlarmScheduler {
    private Context context;

    public AlarmScheduler(Context context) {
        this.context = context;
    }

    public void scheduleAlarm(long triggerTime) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, AlarmReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);

        alarmManager.setExact(AlarmManager.RTC_WAKEUP, triggerTime, pendingIntent); // Noncompliant
        alarmManager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, triggerTime, pendingIntent); // Noncompliant

        long windowLengthMillis = 5 * 60 * 1000; // 5 minutes in milliseconds
        alarmManager.setWindow(AlarmManager.RTC_WAKEUP, triggerTime, windowLengthMillis, pendingIntent); // Noncompliant
    }
}
