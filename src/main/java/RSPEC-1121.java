import java.io.BufferedReader;

String cont = "example";
int pos1 = 0, pos2 = 5;

String str;
if (!(str = cont.substring(pos1, pos2)).isEmpty()) {  // Noncompliant
  // do something with "str"
}

void processLine(String line) {}
