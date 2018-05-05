class Candy{
    static {System.out.println("Loading Candy");}
}
class Gum{
    static {System.out.println("Loading Gum");}
    void draw(){System.out.println("Gum draw()");}
}
class Cookie{
    static {System.out.println("Loading Cookie");}
}
public class SweetShop {
    public static void main(String[] args){
        /*System.out.println("inside main");
        new Candy();
        System.out.println("After create Candy");*/
        try {
            Class<?> c = Class.forName("Gum");
            Object object =  c.newInstance();
            if (object instanceof Gum){
                ((Gum)object).draw();
            }
            if (object instanceof Cookie){
                System.out.println("is instanceof cookie");
            }else {
                System.out.println("is not instanceof cookie");
            }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        /*System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");*/
    }
}
