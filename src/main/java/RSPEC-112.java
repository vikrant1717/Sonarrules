void checkValue(int value) throws Throwable { // Noncompliant: signature is too broad
    if (value == 42) {
        throw new RuntimeException("Value is 42"); // Noncompliant: This will be difficult for consumers to handle
    }
}
