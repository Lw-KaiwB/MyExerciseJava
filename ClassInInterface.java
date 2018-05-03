public interface ClassInInterface {
    void body();

    class MyClassInInterface implements ClassInInterface{
        @Override
        public void body() {
            System.out.println("my test");
        }
    }
     static void main(String[] args){
        ClassInInterface my = new MyClassInInterface();
        my.body();
    }
}
