public class Example {
    public void demonstrateInconsistentIndentation() {
        boolean condition = true;
        
        if (condition)
            firstActionInBlock();
            secondAction();  // Noncompliant: secondAction is executed unconditionally
        thirdAction();

        if (condition) firstActionInBlock(); secondAction();  // Noncompliant: secondAction is executed unconditionally

        if (condition) firstActionInBlock();
            secondAction();  // Noncompliant: secondAction is executed unconditionally

        if (condition); secondAction();  // Noncompliant: secondAction is executed unconditionally

        String[] array = {"a", "b", "c"};
        String str = "";
        for (int i = 0; i < array.length; i++)
            str = array[i];
            doTheThing(str);  // Noncompliant: executed only on the last element
    }
    
    void firstActionInBlock() {}
    void secondAction() {}
    void thirdAction() {}
    void doTheThing(String str) {}
}
