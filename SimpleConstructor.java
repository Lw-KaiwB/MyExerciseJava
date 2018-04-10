public class SimpleConstructor {
    static String string = "a";
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            //Rock rock = new Rock();
            Rock1 rock1 = new Rock1(i);
        }
       System.out.println("string is not init "+(string==null ));
    }


}

class Rock {
    Rock() {
        System.out.println("this is rock");
    }
}

class  Rock1{
    Rock1(int i){
        String str = ""+i;
        System.out.println("str="+str);
    }
        }