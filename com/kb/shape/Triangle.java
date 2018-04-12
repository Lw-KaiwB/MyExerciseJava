package com.kb.shape;
import com.kb.unit.Print;

public class Triangle extends Shape {
    public void draw() {
        Print.print("Triangle.draw()");
    }

    public void erase() {
        Print.print("Triangle.erase()");
    }

    Triangle() {

    }

    Triangle(int i) {
        super(i);
        Print.print("Drawing Triangle");
    }

    void dispose() {
        Print.print("Erasing Triangle");
        super.dispose();
    }
}
