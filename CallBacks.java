
interface Incrementable {
    void increment();
}

class Calleel implements Incrementable {
    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println("i=" + i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Other operator");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}

class Callee2 extends MyIncrement implements Incrementable {
    private int i = 0;

    public void increment() {
        super.increment();
        i++;
        System.out.println("ii=" + i);
    }

    private class Closure implements Incrementable {
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbakcReference;

    Caller(Incrementable cbh) {
        callbakcReference = cbh;
    }

    void go() {
        callbakcReference.increment();
    }
}

public class CallBacks {
    public static void main(String[] args) {
        Calleel c1 = new Calleel();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        //caller1.go();
        caller2.go();
        //caller2.go();
    }
}


















