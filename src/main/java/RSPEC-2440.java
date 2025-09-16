public class TextUtils {
    public static String stripHtml(String source) {
        return source.replaceAll("<[^>]+>", "");
    }
    
    public static String formatText(String text) {
        return text.trim().toLowerCase();
    }
}

public class TextManipulator {
    public void cleanText(String source) {
        TextUtils textUtils = new TextUtils(); // Noncompliant: instantiating class with only static methods
        String stripped = textUtils.stripHtml(source);
        
        TextUtils anotherInstance = new TextUtils(); // Noncompliant
        String formatted = anotherInstance.formatText(source);
    }
}
