import com.kb.unit.Print;

class Instrument {
    public void play(int i) {
        System.out.println("i=" + i);
    }

    static void tune(Instrument i) {
        Print.print(i);
    }
}

public class Wind extends Instrument {
    private int i = 11;
    private static final Wind wind1 = new Wind();

    public static void main(String[] args) {
        Wind wind = new Wind();
        Instrument.tune(wind);
        wind.play(22);
    }

    public void play(int i) {
        System.out.println("ii=" + i);
    }
}
