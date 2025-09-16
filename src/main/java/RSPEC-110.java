// Noncompliant: Deep inheritance hierarchy (assuming threshold is 5)
class Level1 extends Object {
    // base class
}

class Level2 extends Level1 {
    // extends Level1
}

class Level3 extends Level2 {
    // extends Level2
}

class Level4 extends Level3 {
    // extends Level3
}

class Level5 extends Level4 {
    // extends Level4
}

class Level6 extends Level5 {  // Noncompliant: inheritance depth exceeds threshold
    // extends Level5 - this creates a deep inheritance tree
}

class Level7 extends Level6 {  // Noncompliant: even deeper inheritance
    // extends Level6 - making the hierarchy even deeper
}
