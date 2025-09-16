import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLInputFactory;

public class Example {
    public void decode() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // Noncompliant
        
        XMLInputFactory xmlFactory = XMLInputFactory.newInstance(); // Noncompliant
    }
    
    public void processXml() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); // Noncompliant: XXE vulnerability
        XMLInputFactory xif = XMLInputFactory.newInstance(); // Noncompliant: XXE vulnerability
    }
}
