import com.kb.shape.Circle;
import com.kb.shape.Shape;

public class GenericClassReferences {
    public static void main(String[] args){
        Class intClass = int.class;
        Class<Integer> genericIntClass= int.class;
        genericIntClass = Integer.class;
        intClass = double.class;

        Class<?> genericClass = int.class;
        genericClass = double.class;
        genericClass = Shared.class;

        Class<? extends Shape> generNumClass = Circle.class;


    }
}
