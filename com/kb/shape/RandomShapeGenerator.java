package com.kb.shape;

import java.util.Random;

public class RandomShapeGenerator {
    private Random random = new Random(47);
    public Shape next(){
        int type = random.nextInt(4);
        //Print.print("type="+type);
        switch (type){
            default:
            case 0:return new Circle();
            case 1:return new Square();
            case 2:return new Triangle();
            case 3:return new Line();
        }
    }
}
