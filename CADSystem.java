import com.kb.unit.Print;

public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * j);
        }
        c = new Circle(2);
        t = new Triangle(3);
        Print.print("Combined constructor");
    }

    public void dispose() {
        Print.print("CADSystem.dispose");
        t.dispose();
        c.display();
        for (int i = 0; i < lines.length; i++) {
            if (lines[i] ==null){
                Print.print("line["+i+"] is null");
            }else {
                lines[i].dispose();
            }

        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {

        } finally {
            x.dispose();
        }
    }
}

class Shape {
    Shape(int i) {
        Print.print("shape constructor"+" i="+i);
    }

    void dispose() {
        Print.print("Shape dispose");
    }

}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        Print.print("Drawing Circle");
    }

    void display() {
        Print.print("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        Print.print("Drawing Triangle");
    }

    void dispose() {
        Print.print("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;

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

