package clas20170615;
import com.sun.org.apache.bcel.internal.generic.NEW;

import static  util.Print.*;
/**
 * Created by 程荣凯 on 2017/6/15.
 */
class Bowl{
    Bowl(int maker){
        print("Bowl("+maker+")");
    }
    void f1(int maker)
    {
        print("f1("+maker+")");
    }
}
class Table{
    static Bowl bowl1 = new Bowl(1);
    Table(){
        print("Table()");
        bowl2.f1(1);
    }
    void f2(int maker){
        print("f2("+maker+")");
    }
    Bowl bowl2 = new Bowl(2);
}
class Cupbod{
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupbod(){
        print("Cupbod()");
        bowl4.f1(2);
    }
    void f3(int maker){
        print("f3("+maker+")");
    }
    static Bowl bowl5 = new Bowl(5);
}
public class StaticInit {
   static   Table table;
    static Cupbod cupbod;
    static {
        table = new Table();
        cupbod = new Cupbod();
   }
    public static void main(String[] args) {
        print("start");
        new Cupbod();
        print("next");
        new Cupbod();
        table.f2(1);
        cupbod.f3(1);
    }

}
