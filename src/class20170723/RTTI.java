package class20170723;

/**
 * Created by 程荣凯 on 2017/7/23.
 */
import java.util.*;
class Useful {
    public void f() {System.out.println(1);}
    public void g() {System.out.println(2);}
}
class MoreUseful extends Useful {
    public void f() {
        System.out.println(1.1);
    }
    public void g() {
        System.out.println(2.1);
    }
    public void u() {
        System.out.println(3);
    }
    public void v() {
        System.out.println(4);
    }
    public void w() {
        System.out.println(5);
    }
}
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].g();
// Compile-time: method not found in Useful:
 //x[1].u();
        ((MoreUseful)x[1]).u(); // Downcast/RTTI
       // ((MoreUseful)x[0]).u(); // Exception thrown
    }
} ///: