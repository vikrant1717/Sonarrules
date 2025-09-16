public class Example {
    // Noncompliant: method with high cyclomatic complexity
    public int complexMethod(int x) {
        if (x > 0) {
            if (x > 10) {
                if (x > 20) {
                    if (x > 30) {
                        if (x > 40) {
                            if (x > 50) {
                                return x * 2;
                            } else {
                                return x + 5;
                            }
                        } else {
                            return x - 3;
                        }
                    } else {
                        return x / 2;
                    }
                } else {
                    return x + 1;
                }
            } else {
                return x * 3;
            }
        } else {
            return 0;
        }
    }
}
