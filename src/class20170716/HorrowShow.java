package class20170716;

import java.util.List;

/**
 * Created by 程荣凯 on 2017/7/16.
 */
interface Monster{
    void meace();
}
interface DangerMonster extends Monster{
    void destory();
}
interface Leather{
    void kill();
}
class DragonM implements DangerMonster{
   public void meace(){};
   public void destory(){};
}
interface LeatherDragon extends DangerMonster,Leather{
    void drinkBlood();
}
public class HorrowShow {
    static void u(Monster b){
        b.meace();
    }
    static void v(DangerMonster d){
        d.meace();
        d.destory();
    }

    public static void main(String[] args) {
        DragonM D = new DragonM();
        u(D);
        v(D);
    }
}
