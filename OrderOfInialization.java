class Window {
    Window(int mark) {
        System.out.println("window(" + mark + ")");
    }
}

class House {

    Window window1 = new Window(1);

    House() {
        System.out.println("House");
        window3 = new Window(33);
    }

    Window window2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window window3 = new Window(3);

}

public class OrderOfInialization {
    public static void main(String[] args){
        House house = new House();
        house.f();
    }
}
