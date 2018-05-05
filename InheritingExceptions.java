class SimpleException extends Exception {
    SimpleException(){}
    SimpleException(String s){super(s);}
}

public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException("Throw SimpleException from f()");
    }

    public static void main(String[] args) {
        InheritingExceptions ie = new InheritingExceptions();
        try {
            ie.f();
        }catch (SimpleException e){
            System.out.println(e);
        }

    }
}
