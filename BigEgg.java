class Egg{
    Egg(){
        new Yolk();
    }
    private Yolk y;
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg Yolk()");
        }
    }
}

public class BigEgg extends Egg{

    BigEgg(){
        new Yolk();
    }
    public class Yolk{
        public Yolk(){
            System.out.println("BigEgg Yolk()");
        }
    }
    public static void main(String[] args){
        new BigEgg();
    }
}
