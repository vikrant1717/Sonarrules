class MyClass {
  private static final Map<String, String> MY_MAP = new HashMap<String, String>() {
    {
      put("a", "b");
    }
  }; // Noncompliant - HashMap should be extended only to add behavior, not for initialization
}
