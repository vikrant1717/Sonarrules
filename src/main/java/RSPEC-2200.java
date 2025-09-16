import java.util.Comparator;

public class Example {
    boolean isAGreaterThanB(Comparable<Integer> a, Integer b) {
        return a.compareTo(b) == 1; // Noncompliant: checking for exact return value
    }
    
    boolean isEqual(String a, String b) {
        return a.compareTo(b) == 0; // Compliant: checking for equality
    }
    
    public static void main(String[] args) {
        ByteComparator comparator = new ByteComparator();
        if (comparator.compare((byte) 23, (byte) 42) == -1) { // Noncompliant: checking for exact return value
            System.out.println("23 < 42");
        } else {
            System.out.println("23 >= 42");
        }
        
        if (comparator.compare((byte) 50, (byte) 30) == 1) { // Noncompliant: checking for exact return value
            System.out.println("50 > 30");
        }
    }

    static class ByteComparator implements Comparator<Byte> {
        @Override
        public int compare(Byte a, Byte b) {
            return a - b;
        }
    }
}
