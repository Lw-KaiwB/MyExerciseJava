package com.kb.shape;
import com.kb.unit.Print;

public class Circle extends Shape {
    public void draw() {
        Print.print("Circle1.draw()");
    }

    public void erase() {
        Print.print("Circle1.erase()");
    }

    Circle() {

    }

    Circle(int i) {
        super(i);
        Print.print("Drawing Circle");
    }

    void display() {
        Print.print("Erasing Circle");
        super.dispose();
    }

    public void color(){
        Print.print(this.getClass()+" child color");
    }
}
