import java.io.File;

public class Example {
    public void demonstrateRegexIssues() {
        String str = "/File|Name.txt";

        String clean = str.replaceAll(".",""); // Noncompliant: dot matches everything
        String clean2 = str.replaceAll("|","_"); // Noncompliant: pipe matches between characters
        String clean3 = str.replaceAll(File.separator,""); // Noncompliant: platform-specific separator

        String clean4 = str.replaceFirst(".",""); // Noncompliant: dot issue
        String clean5 = str.replaceFirst("|","_"); // Noncompliant: pipe issue
        String clean6 = str.replaceFirst(File.separator,""); // Noncompliant: separator issue
    }
}
