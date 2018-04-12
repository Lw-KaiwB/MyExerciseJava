import com.kb.unit.Print;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        Print.print("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            Print.print("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        String str = "shared " + id;
        return str;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        Print.print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        Print.print("disposing " + this);
        shared.dispose();
    }

    public String toString() {
        String str = "Composing " + id;
        return str;
    }
}

public class ReferenceCounting {

    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
        for (Composing c : composings) {
            c.dispose();
        }
    }
}
