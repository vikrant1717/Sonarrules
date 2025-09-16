public class Example {
    public void demonstrateMissingDefault(int param) {
        switch (param) {  //missing default clause
          case 0:
            doSomething();
            break;
          case 1:
            doSomethingElse();
            break;
        }
        
        switch (param) {
          default: // default clause should be the last one
            error();
            break;
          case 0:
            doSomething();
            break;
          case 1:
            doSomethingElse();
            break;
        }
    }
    
    void doSomething() {}
    void doSomethingElse() {}
    void error() {}
}
