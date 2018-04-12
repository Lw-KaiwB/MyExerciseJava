import com.kb.unit.Print;

import java.util.Random;

interface RandVals{
    Random RANDOM = new Random(47);
    int RANDOM_INT = RANDOM.nextInt(10);
    long RANDOM_LONG = RANDOM.nextLong()*10;
    float RANDOM_FLOAT = RANDOM.nextFloat() * 10;
    double RANDOM_DOUBLE = RANDOM.nextDouble()*10;
}
public class TestRandVals {
    public static void main(String[] args){
        Print.print(RandVals.RANDOM_FLOAT);
    }
}
