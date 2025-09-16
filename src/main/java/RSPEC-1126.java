boolean expression = true;
Object param;

boolean foo(Object param) {
  if (expression) { // Noncompliant
    bar(param, true, "qix");
  } else {
    bar(param, false, "qix");
  }

  if (expression) {  // Noncompliant
    return true;
  } else {
    return false;
  }
}

void bar(Object param, boolean flag, String str) {}
