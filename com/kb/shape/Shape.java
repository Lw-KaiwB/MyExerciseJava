package com.kb.shape;
import com.kb.unit.Print;

public class Shape {
    Shape(){

    }
    Shape(int i) {
        Print.print("shape constructor"+" i="+i);
    }
    void dispose() {
        Print.print("Shape dispose");
    }

    public void draw(){
        Print.print(this.getClass()+" Parent draw()");
    }
    public void erase(){
        Print.print(" erase");
    }

    public void color(){
        Print.print(this.getClass()+" color");
    }

}
