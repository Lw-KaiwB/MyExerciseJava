
class Cup{
    Cup(int marker){
        System.out.println("Cup("+marker+")");
    }
    void f(int marker){
        System.out.println("f("+marker+")");
    }
}

class Cups{
    static String s1 = "s1";
    static String s2;
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
        s2 ="s2";
    }

    Cups(){
        System.out.println("Cups");
    }
    static void f2(){
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
    }
}
public class ExplicitStatic {
    public static void main(String[] args){
        System.out.println("Inside main()");
       // Cups.cup1.f(99);
        //Cups cups = new Cups();
        Cups.f2();
    }
}
