boolean booleanMethod() { return true; }
boolean exp = true;
boolean booleanVariable;

void demonstrateBooleanLiterals() {
    if (booleanMethod() == true) { /* ... */ } // Noncompliant
    if (booleanMethod() == false) { /* ... */ } // Noncompliant
    if (booleanMethod() || false) { /* ... */ } // Noncompliant
    doSomething(!false); // Noncompliant
    doSomething(booleanMethod() == true); // Noncompliant
    
    booleanVariable = booleanMethod() ? true : false; // Noncompliant
    booleanVariable = booleanMethod() ? true : exp; // Noncompliant
    booleanVariable = booleanMethod() ? false : exp; // Noncompliant
    booleanVariable = booleanMethod() ? exp : true; // Noncompliant
    booleanVariable = booleanMethod() ? exp : false; // Noncompliant
}

void doSomething(boolean b) {}
