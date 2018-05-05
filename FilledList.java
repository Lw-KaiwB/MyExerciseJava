import java.util.ArrayList;
import java.util.List;

class CountedInteger {
    private static int counter;
    private long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){
        this.type = type;
    }

    public List<T> createTest(int t){
        List<T> tList = new ArrayList<>();
        try {
            for (int i=0;i<t;i++){
                tList.add(type.newInstance());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return tList;
    }

    public static void main(String[] args){
        FilledList<CountedInteger> f = new FilledList<>(CountedInteger.class);

        System.out.println(f.createTest(15));
    }
}
