public class Flower {
    static enum Color { // Noncompliant; static is redundant here
        RED, YELLOW, BLUE, ORANGE
    }
    
    static enum Size { // Noncompliant
        SMALL, MEDIUM, LARGE
    }
}
