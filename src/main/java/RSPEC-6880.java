sealed interface Expression {}
record Plus(Expression left, Expression right) implements Expression {}
record Minus(Expression left, Expression right) implements Expression {}
record Div(Expression left, Expression right) implements Expression {}

class Example {
    int eval(Expression expr){
        if(expr instanceof Plus plus){ // Noncompliant
            return eval(plus.left()) + eval(plus.right());
        }else if(expr instanceof Div div){
            return eval(div.left()) / eval(div.right());
        }else if(expr instanceof Minus minus){
            return eval(minus.left()) - eval(minus.right());
        } else {
            throw new IllegalArgumentException("Unknown expression");
        }
    }

    enum Color{RED,GREEN,YELLOW}
    String name(Color c){
        if(c == Color.RED){ // Noncompliant
            return "red";
        }else if(c == Color.GREEN){
            return "green";
        }else if(c == Color.YELLOW){
            return "yellow";
        }else{
            throw new IllegalArgumentException("Unknown color");
        }
    }

    int points(int result){
        if(result == 2){ // Noncompliant
            return 10;
        } else if(result == 3 || result==4 ){
            return 20;
        } else if (result == 5) {
            return 50;
        }else{
            return 0;
        }
    }

    class Circle{}
    class Rectangle{}
    class Square{}
    String name(Object shape){
        if (shape instanceof Circle) { // Noncompliant
            return "circle";
        } else if (shape instanceof Rectangle) {
            return "rectangle";
        } else if (shape instanceof Square) {
            return "square";
        } else {
            throw new IllegalArgumentException();
        }
    }
}
