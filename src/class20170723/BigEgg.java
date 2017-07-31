package class20170723;

/**
 * Created by 程荣凯 on 2017/7/23.
 */
class Egg{
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg.Yolk");
        }
    }
    private Yolk y;
    public Egg(){
        System.out.println("New Egg");
        y = new Yolk();
    }
}
public class BigEgg extends Egg{
    public class Yolk{
        public Yolk(){
            System.out.println("BigEgg.Yolk");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}

