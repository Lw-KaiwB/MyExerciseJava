import java.util.Random;

import static com.kb.unit.Print.*;

public class ArrsyClassObj {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        for (int i = 0; i < a.length; i++) {
            System.out.println("[" + i + "]=" + a[i]);
        }
        System.out.println("---------------");
        int[] b = new int[random.nextInt(20)];
        for (int i = 0; i < b.length; i++) {
            System.out.println("[" + i + "]=" + b[i]);
        }

        print();
    }
}
