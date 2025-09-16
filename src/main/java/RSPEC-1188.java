import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example {
    public void demonstrateLongAnonymousClass() {
        JButton button = new JButton("Click me");
        
        // Noncompliant: Anonymous class is too long
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This anonymous class has too many lines
                System.out.println("Button clicked!");
                // Line 1 of processing
                String message = "Processing...";
                // Line 2 of processing
                System.out.println(message);
                // Line 3 of processing
                doSomething();
                // Line 4 of processing
                doSomethingElse();
                // Line 5 of processing
                finalizeProcessing();
                // ... many more lines
            }
            
            private void doSomething() { /* ... */ }
            private void doSomethingElse() { /* ... */ }
            private void finalizeProcessing() { /* ... */ }
        });
    }
}
