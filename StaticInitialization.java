class Bowl{
    Bowl(int marker){
        System.out.println("Bowl("+marker+")");
    }
    void f1(int marker){
        System.out.println("f1("+marker+")");
    }
}

class Table{
    static Bowl bowl1 = new Bowl(1);
    Table(){
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int marker){
        System.out.println("f2("+marker+")");
    }
    static Bowl bowl2 = new Bowl(2);
}

class CupBoard{
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    CupBoard(){
        System.out.println("CupBoard");
        bowl4.f1(2);
    }
    void f3(int marker){
        System.out.println("f3("+marker+")");
    }
    static Bowl bowl5 = new Bowl(5);
}

class Fork{
    Fork(){
        System.out.println("Constractor fork");
    }
    static int i;
    static {
        i = 0;
        System.out.println("Fork static");
    }

    static void getForkCount(){
        System.out.print("fork count ="+i);
    }
}
public class StaticInitialization {

    public static void main(String[] args){
        /*System.out.println("create new Cupboard() in main");
        new CupBoard();
        System.out.println("create new Cupboard1() in main");
        new CupBoard();*/
        //table.f2(1);
        Fork.getForkCount();
    }
    /*static Table table = new Table();
    static CupBoard cupBoard = new CupBoard();*/
}
