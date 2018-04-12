import com.kb.unit.Print;

class Useful{
    public void f(){
        Print.print("Useful.f()");}
    public void g(){Print.print("Useful.g()");}
}
class MoreUseful extends Useful{
    public void f(){Print.print("MoreUseful.f()");}
    public void g(){Print.print("MoreUseful.g()");}
    public void u(){}
    public void v(){}
    public void w(){}
}
public class RTTI {

    public static void main(String[] args){
        Useful[] x ={new Useful(),new MoreUseful()};
        x[0].f();
        ((MoreUseful)x[1]).u();
    }
}
