class MNA{
    private void f(){System.out.println("this is f");}
    class A{
        private void g(){System.out.println("this is g");}
        public class B{
            void h(){
                g();
                f();
            }
        }
    }
}
public class MultiNestingAccess {
    public static void main(String[] args){
        MNA.A.B b = new MNA().new A().new B();
        b.h();
    }
}
