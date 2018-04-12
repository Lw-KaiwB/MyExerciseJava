package com.kb.shape;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[12];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shape : s) {
            shape.draw();
            //shape.color();
        }
    }
}
