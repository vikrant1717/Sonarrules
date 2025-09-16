class Utilities {
    private static String magicWord = "magic";

    private String getMagicWord() { // Noncompliant: should be static
        return magicWord;
    }

    private void setMagicWord(String value) { // Noncompliant: should be static
        magicWord = value;
    }
    
    final String getConstant() { // Noncompliant: should be static
        return "CONSTANT_VALUE";
    }
    
    private int calculate(int x, int y) { // Noncompliant: should be static
        return x + y;
    }
}
