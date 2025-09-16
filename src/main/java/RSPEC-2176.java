package org.foo.presentation;

import org.foo.domain.User;

public class User implements org.foo.domain.User { // Noncompliant
    // class implementation
}

// Classes in different packages with same names
package org.foo.domain {
    public interface User {
        // interface definition
    }
}
