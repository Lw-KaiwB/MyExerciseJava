class WithInner {
    WithInner() {
        System.out.println("WithInner");
    }

    abstract class Inner {
        Inner(){
            System.out.println("Inner");
        }
        abstract void f();
    }
}

public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner withInner) {
        withInner.super();

    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
        ii.f();
    }

    @Override
    void f() {
        System.out.println("f");
    }
}
