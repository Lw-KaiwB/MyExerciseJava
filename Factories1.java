
interface Service11 {
    void mothod11();

    void mothold22();
}

interface Factory {
    Service11 getService();
}

class Cortal1 implements Service11 {
    @Override
    public void mothod11() {
        System.out.println("Cortal1 methold1");
    }

    @Override
    public void mothold22() {
        System.out.println("Cortal1 methold2");
    }

    public static Factory factory = new Factory() {
        @Override
        public Service11 getService() {
            return new Cortal1();
        }
    };
}

class Cortal2 implements Service11 {
    @Override
    public void mothod11() {
        System.out.println("Cortal2 methold1");
    }

    @Override
    public void mothold22() {
        System.out.println("Cortal2 methold2");
    }

    public static Factory factory = new Factory() {
        @Override
        public Service11 getService() {
            return new Cortal2();
        }
    };
}

public class Factories1 {
    public static void custom(Factory factory) {
        Service11 s = factory.getService();
        s.mothod11();
        s.mothold22();
    }

    public static void main(String[] args) {
        custom(Cortal1.factory);
        custom(Cortal2.factory);
    }
}

































