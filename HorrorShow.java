import com.kb.unit.Print;

interface Monster{
    void menace();
}
interface DangerousMonster extends Monster{
    void destroy();
}
interface Lethal{
    void kill();
}
class DragonZilla implements DangerousMonster{
    @Override
    public void menace() {
        Print.print("Dragonzilla manace");
    }

    @Override
    public void destroy() {
        Print.print("Dragonzilla destroy");
    }
}
interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();

}
class VeryBadVampire implements Vampire{
    @Override
    public void menace() {
        Print.print("VeryBadVampire menace");
    }

    @Override
    public void destroy() {
        Print.print("VeryBadVampire destroy");
    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
}
public class HorrorShow {
    static void u(Monster b){b.menace();}
    static void v(DangerousMonster d){d.menace();d.destroy();}
    static void w(Lethal l){l.kill();}
    public static void main(String[] args){
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
