// SQLiteDatabase
SQLiteDatabase db = activity.openOrCreateDatabase("test.db", Context.MODE_PRIVATE, null); // Sensitive

// SharedPreferences
SharedPreferences pref = activity.getPreferences(Context.MODE_PRIVATE); // Sensitive

// Realm
RealmConfiguration config = new RealmConfiguration.Builder().build();
Realm realm = Realm.getInstance(config); // Sensitive
