int myVariable = 0;

switch (myVariable) {
  case 0: // Noncompliant: 6 lines till next case
    methodCall1("");
    methodCall2("");
    methodCall3("");
    methodCall4("");
    break;
  case 1:
    break;
}

void methodCall1(String s) {}
void methodCall2(String s) {}
void methodCall3(String s) {}
void methodCall4(String s) {}
