import com.kb.unit.Print;

class Glyph{
    void draw(){
        Print.print("Glyph.draw()");
    }
    Glyph(){
        Print.print("Glyph() before draw()");
        draw();
        Print.print("Glyph() after draw()");
    }
}

class RoundGlyph extends  Glyph{
    private int raduis = 1;
    RoundGlyph(int r){
        raduis = r;
        Print.print("RoundGlyph.RoundGlyph(). radius="+raduis);
    }

    void draw(){
        Print.print("RoundGlyph.draw().radius = "+raduis);
    }
}
public class PolyConstructors {
    public static void main(String[] args){
        new RoundGlyph(5);
    }
}
