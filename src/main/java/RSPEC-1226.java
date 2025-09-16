public class Example {
    public void doTheThing(String str, int i, List<String> strings) {
      str = Integer.toString(i); // Noncompliant: parameter reassigned before read

      for (String s : strings) {
        s = "hello world"; // Noncompliant: foreach parameter reassigned
      }
    }
}
