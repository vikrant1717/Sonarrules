// Example with Realm
String key = "gb09ym9ydoolp3w886d0tciczj6ve9kszqd65u7d126040gwy86xqimjpuuc788g";
RealmConfiguration config = new RealmConfiguration.Builder()
    .encryptionKey(key.getBytes()) // Noncompliant: hardcoded key
    .build();
Realm realm = Realm.getInstance(config);

// Example with SQLCipher
String key2 = "gb09ym9ydoolp3w886d0tciczj6ve9kszqd65u7d126040gwy86xqimjpuuc788g";
SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase("test.db", key2, null); // Noncompliant: hardcoded key
