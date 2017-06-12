package demo01;

/**
 * Created by 程荣凯 on 2017/6/12.
 */
class letter
{
    char c;
}
public class PassObject {
    static void f(letter f)
    {
        f.c = 'z';
    }

    public static void main(String[] args) {
        letter l = new letter();
        l.c = 'a';
        System.out.println("l.c="+l.c);
        f(l);
        System.out.println("l.c="+l.c);
    }
}
