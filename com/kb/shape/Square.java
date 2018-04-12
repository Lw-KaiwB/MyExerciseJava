package com.kb.shape;
import com.kb.unit.Print;

public class Square extends Shape{
    public void draw(){
        Print.print("Square.draw()");
    }
    public void erase(){
        Print.print("Square.erase()");
    }
}
