import com.kb.unit.Print;

interface Service {
    void mothod1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class MyService1 implements Service {
    @Override
    public void mothod1() {
        Print.print("MyService1 mothod1");
    }

    @Override
    public void method2() {
        Print.print("MyService1 mothod2");
    }
}

class MyService2 implements Service {
    @Override
    public void mothod1() {
        Print.print("MyService2 mothod1");
    }

    @Override
    public void method2() {
        Print.print("MyService2 mothod1");
    }
}

class ServiceFactory1 implements ServiceFactory {
    @Override
    public Service getService() {
        return new MyService1();
    }
}

class ServiceFactory2 implements ServiceFactory {
    @Override
    public Service getService() {
        return new MyService2();
    }
}

class ServiceFactoryAll implements ServiceFactory{
    Service s ;
    public ServiceFactoryAll(Service s){
        this.s = s;
    }

    @Override
    public Service getService() {
        return s;
    }
}

public class Factories {
    private static void serverComsumer(ServiceFactory sf){
        Service s = sf.getService();
        s.mothod1();
        s.method2();
    }
    public static void main(String[] args) {
        serverComsumer(new ServiceFactoryAll(new MyService1()));
        serverComsumer(new ServiceFactoryAll(new MyService2()));
    }
}
