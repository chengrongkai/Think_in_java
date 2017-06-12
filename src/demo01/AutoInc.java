package demo01;

/**
 * Created by 程荣凯 on 2017/6/12.
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i="+i);
        print("++i="+ ++i);
        print("i++="+ i++);
        print("i="+ i);
        print("--i="+ --i);
        print("i--="+ i--);
        print("i="+ i);
    }
    static void print(String str){
        System.out.println(str);
    }
}
