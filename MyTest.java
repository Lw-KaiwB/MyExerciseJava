import com.kb.unit.Range;

class My {
    int ss = 1;
    public My(String str) {
        System.out.println("my=" + str);
    }

    protected void write(String s) {
        System.out.println("my write " + s+ss);
    }
}

class SuperInsect {
    private static int x = getX("superInsect x initialized");

    public SuperInsect() {
        System.out.println("superInsect class");
    }
    My my = new My("SuperInsect");
    static int getX(String s) {
        System.out.println(s);
        return 22;
    }
}

class Insect extends SuperInsect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i=" + i + " j=" + j);
        j = 39;
    }
    Insect(int w) {
        System.out.println("i=" + i + " j=" + j);
        j = 39;
    }

    My my = new My("Insect");
    private static int x1 = printInit("static Insert.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }


}

public class MyTest extends Insect {
    private int k = printInit("Test.k initialized");

    public MyTest() {
        System.out.println("k=" + k);
        System.out.println("j=" + j);
        System.out.println("test constr");
        super.my.write("mytest");
    }


    My my = new My("test");
    private static int x2 = printInit("static Textx2 initialized");

    public static void main(String[] args) {
        System.out.println("Test constructor");
        MyTest test = new MyTest();
       Range range = new Range();
       Range.RangeOn rangeOn = new Range().new RangeOn();
    }


}
