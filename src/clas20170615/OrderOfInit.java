package clas20170615;
import static util.Print.*;
/**
 * Created by 程荣凯 on 2017/6/15.
 */
class Window{
    Window(int maker){
        print(maker);
    }
}
class House{
    Window w1 = new Window(1);
    House(){
        print("House()");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void  f(){print("f()");}
    Window w3 = new Window(3);
}
public class OrderOfInit {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
