public class Example {
    public void demonstrateDuplicateConditions() {
        int param = 1;
        
        if (param == 1)
            openWindow();
        else if (param == 2)
            closeWindow();
        else if (param == 1)  // Noncompliant
            moveWindowToTheBackground();
    }
    
    void openWindow() {}
    void closeWindow() {}
    void moveWindowToTheBackground() {}
}
