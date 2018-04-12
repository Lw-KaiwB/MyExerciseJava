package com.kb.shape;

import com.kb.unit.Print;

public class Line extends Shape {
    private int start, end;

    Line(){

    }
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        Print.print("Draw line start=" + start + " end=" + end);
    }

    void dispose() {
        Print.print("Erasing line start=" + start);
        super.dispose();
    }
}
