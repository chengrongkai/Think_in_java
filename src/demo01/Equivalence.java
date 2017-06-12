package demo01;

/**
 * Created by 程荣凯 on 2017/6/12.
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer i1 = new Integer(47);
        Integer i2 = new Integer(47);
        System.out.println(i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(i1.equals(i2));

        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
}
class Value{
    int i;
}
