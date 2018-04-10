class Book{
    boolean checkedOut = false;
    Book(boolean checkedOut){
        checkedOut = checkedOut;
        System.out.println("checkedOut="+checkedOut);
    }
    void checkIn(){
        checkedOut = false;
    }
    protected void finalize(){
        if (checkedOut){

            System.out.println("Error:checked out");
        }else {
            System.out.println("Error:checked out else");
        }
    }
}

public class TreminationCondition {
    public static void main(String[] args){
        Book novel = new Book(true);
        //novel.checkIn();
        new Book(true);
        System.gc();

    }
}
