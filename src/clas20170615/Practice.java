package clas20170615;
import static util.Print.*;
/**
 * Created by 程荣凯 on 2017/6/15.
 */
public class Practice {
    public static void main(String[] args) {
        new test(3);
    }
}
class test{
    static int a = 1;
    static int b;
    static {
        b = 2;
    }
    static void print()
    {
        System.out.println("##"+a);
        System.out.println("##"+b);
    }
    test(int flag){
        System.out.println(a);
        System.out.println(a);
        print();
    }
}