package demo02;

/**
 * Created by 程荣凯 on 2017/6/14.
 */
public class URShift {
    public static void main(String[] args) {
        System.out.println(256*256*256*256);
        int i = -1;
        i >>>= 2;
        System.out.println(i);
        long l = -1;
        l >>>= 10;
        System.out.println(l);
        short s = -1;
        s >>>= 10;
        System.out.println(s);
        byte b = -1;
        b >>>= 10;
        System.out.println(b);
    }
}
