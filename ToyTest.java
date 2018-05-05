
interface HasBattreies{}
interface WaterFroof{}
interface Shoots{}

class Toy{
    Toy(){}
    Toy(int i){}
    void draw(){
        System.out.println("Toy draw()");
    }
}
class FancyToy extends Toy implements HasBattreies,WaterFroof,Shoots{
    FancyToy(){super(1);}
}
public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("Class name:"+cc.getName()+" is interface?["+cc.isInterface()+"] ");
        System.out.println("Simple name: "+cc.getSimpleName());
        System.out.println("Canonical name:"+cc.getCanonicalName());
    }

    public static void main(String[] args){
        Class c =null;
        try {
            c = Class.forName("FancyToy");
        }catch (ClassNotFoundException e){
            System.out.println("can't find FancyToy");
            System.exit(1);
        }
        //printInfo(c);

        for (Class face : c.getInterfaces()){
            //printInfo(face);
        }
        Class up = c.getSuperclass();
        //printInfo(up);
        Object obj = null;
        try {
            obj = up.newInstance();
            ((Toy)(obj)).draw();
        }catch (Exception e){
            System.out.println("Cannot instantiate");
            System.exit(1);
        }
        //System.out.println(obj.getClass());
    }
}
