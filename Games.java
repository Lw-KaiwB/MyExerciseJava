interface Game {
    boolean moves();
}

interface GameFactory {
    Game getGame();
}

class Checker implements Game {

    int count = 1;
    int sum = 2;

    @Override
    public boolean moves() {
        return ++count == sum;
    }

    public static GameFactory gameFactory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checker();
        }
    };
}

class Cheers implements Game {
    int count = 1;
    int sum = 2;

    private static Cheers mCheers;
    @Override
    public boolean moves() {
        System.out.println("count = "+count);
        return count++ == sum;
    }

    public static GameFactory gameFactory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Cheers();
        }
    };

    /*private static Cheers getCheer(){
        if (mCheers==null){
            mCheers = new Cheers();
        }
        return mCheers;
    }*/
}

public class Games {
    public static void playGame(GameFactory factory){
        Game g =factory.getGame();
        boolean result = g.moves();
        System.out.println("result="+result);
    }

    public static void main(String[] args){
        playGame(Checker.gameFactory);
        playGame(Cheers.gameFactory);
        playGame(Cheers.gameFactory);
    }
}
