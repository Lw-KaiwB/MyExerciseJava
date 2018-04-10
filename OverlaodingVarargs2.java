public class OverlaodingVarargs2 {
    static void f(float i,Character...args){
        System.out.println("first");
    }
    static void f(char i,Character...args){
        System.out.println("second");
    }
    static void g(String...args){
        for (String s:args){
            System.out.print(s+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        /*f(1,'a');
        f('a','a');*/
       /* g(new String[]{"a","b"});
        g("c,d,e");
        System.out.println(Week.Monday);*/
       for (Week w : Week.values()){
           switch (w){
               case Monday:
                   System.out.println("1"+Week.Monday+" "+w.ordinal());
                   break;
               case Thuesday:
                   System.out.println("2"+Week.Monday+" "+w.ordinal());
                   break;
               case Wendday:
                   System.out.println("3"+Week.Monday+" "+w.ordinal());
                   break;
           }
       }
    }

    public enum Week{
        Monday,Thuesday,Wendday
    }

}

