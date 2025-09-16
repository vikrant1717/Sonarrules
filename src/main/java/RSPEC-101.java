class my_class { // Noncompliant: class name should start with uppercase and use camelCase
    public void doSomething() {
        // method implementation
    }
}

class snake_case_class { // Noncompliant: should use PascalCase instead of snake_case
    public void method() {
        // method implementation
    }
}

class lowercase { // Noncompliant: should start with uppercase letter
    public void anotherMethod() {
        // method implementation
    }
}

class CLASS_ALL_CAPS { // Noncompliant: should use PascalCase, not all caps with underscores
    public void yetAnotherMethod() {
        // method implementation
    }
}
