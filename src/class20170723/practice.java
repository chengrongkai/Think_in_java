package class20170723;

/**
 * Created by 程荣凯 on 2017/7/23.
 */
//class Rodent{
//    public void run(){};
//    public void eat(){};
//    public void sing(){};
//}
interface Rodent{
    public void run();
    public void eat();
    public void sing();
}
class Mouse implements Rodent{
    public void run(){
        System.out.println("Mouse run");
    };
    public void eat(){
        System.out.println("Mouse eat");
    };
    public void sing(){
        System.out.println("Mouse sing");
    };
};
class Gerbil implements Rodent{
    public void run(){
        System.out.println("Gerbil run");
    };
    public void eat(){
        System.out.println("Gerbil eat");
    };
    public void sing(){
        System.out.println("Gerbil sing");
    };
}
class Hamster implements Rodent{
    public void run(){
        System.out.println("Hamster run");
    };
    public void eat(){
        System.out.println("Hamster eat");
    };
    public void sing(){
        System.out.println("Hamster sing");
    };
}
public class practice {
    private static Rodent[] rodent;
    public static void main(String[] args) {
        rodent = new Rodent[]{
             new Mouse(), new Gerbil(), new Hamster()
        };
        for (int i = 0; i <rodent.length ; i++) {
            rodent[i].eat();
            rodent[i].run();
            rodent[i].sing();
        }
    }
}
