interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        return new Counter() {
            {
                System.out.println("Counter");
            }

            @Override
            public int next() {
                System.out.print(name);
                /*try {
                    throw new IllegalStateException();
                }catch (Exception e){

                }*/
                return count++;


            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lc = new LocalInnerClass();
        Counter c1 = lc.getCounter("Frist"),
                c2 = lc.getCounter2("Second");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                try {
                    throw new IllegalAccessException("i is " + i);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            System.out.println(c2.next());
        }
        throw  new NullPointerException();
    }
}
