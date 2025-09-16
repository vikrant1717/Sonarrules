public interface Status { // Noncompliant: interface with only constants
  int OPEN = 1;
  int CLOSED = 2;
  int PENDING = 3;
}

interface Colors { // Noncompliant: interface with only constants
  int RED = 0xff0000;
  int GREEN = 0x00ff00;
  int BLUE = 0x0000ff;
}
