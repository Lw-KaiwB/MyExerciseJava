class B{

}
public class NewAvrArgs {
    static void printArgs(Object...args){
        for (Object obj : args){
            System.out.print(obj+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        printArgs(new Integer(47),new Float(3.14),new Double(11.11));
        printArgs(47,3.14f,11.11);
        printArgs("one","two","three");
        printArgs(new Integer[]{1,2,3,4});
        printArgs();
        printArgs(new B(),new B(),new B());
    }
}

