public class OverLaoding {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Tree tree = new Tree();
            Tree tree1 = new Tree(5);
            tree.info();
            tree.info(i+"");

            tree1.info();
            tree1.info(i+"");
        }
    }
}

class Tree {
    int height;

    Tree() {
        height = 0;
        System.out.println("height=" + height);
    }

    Tree(int h) {
        height = h;
        System.out.println("height=" + height);
    }

    void info() {
        System.out.println("this tree height is=" + height);
    }

    void info(String s) {
        System.out.println(s + " tree height is =" + height);
    }
}
