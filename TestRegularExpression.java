import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    public static void main(String[] args){
        args = new String[]{"aaa","ab","ac","ad"};
        /*if (args.length<2){
            System.out.println("e...........");
            System.exit(0);
        }*/
        for (String arg :args){
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()){
                System.out.println("Match \""+m.group()+" \" at positions "+m.start()+"-"+(m.end()-1));
            }
        }
    }
}
