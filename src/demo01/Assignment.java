package demo01;

/**
 * Created by 程荣凯 on 2017/6/12.
 */
class Number{
    int i;
}
public class Assignment {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;
        System.out.println("n1.i="+n1.i);
        System.out.println("n2.i="+n2.i);
        n1 = n2;
        System.out.println("n1.i="+n1.i);
        System.out.println("n2.i="+n2.i);
        n1.i = 27;
        System.out.println("n1.i="+n1.i);
        System.out.println("n2.i="+n2.i);
    }
}
