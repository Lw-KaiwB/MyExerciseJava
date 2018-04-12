import com.kb.unit.Print;

import java.util.Arrays;

class Processer{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}

class Upcase extends Processer{
    String process(Object input){
        return "upcase "+((String)input).toUpperCase();
    }

    @Override
    public String name() {
        return null;
    }
}

class Downcase extends Processer{
    String process(Object input){
        return "Downcase "+ ((String )input).toLowerCase();
    }
}

class Splitter extends Processer{
    String process(Object input){
        return Arrays.toString(((String )input).split(" "));
    }
}


public class Apply {
    public static void process(Processer p ,Object s){
        Print.print("Using Processor "+p.name());
        Print.print(p.process(s));
    }
    public static String s = "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args){
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}
