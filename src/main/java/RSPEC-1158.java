private int isZero(int value){
    return Integer.valueOf(value).compareTo(0); // Noncompliant
}
private String convert(int value){
    return Integer.valueOf(value).toString(); // Noncompliant
}
