class Example {
    void demo(String str) {
        "start123endstart456".replaceAll("start\\w*?(end)?", "x"); // Noncompliant
        str.matches("\\d*?"); // Noncompliant
    }
}
