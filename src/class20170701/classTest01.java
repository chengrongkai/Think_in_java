package class20170701;

/**
 * Created by 程荣凯 on 2017/7/1.
 */
class simple{
    int[] array;
    simple(){
        System.out.println("simple");
    }
    simple(String s){
        System.out.println(s+";"+array);
    }
}
public class classTest01 {
    public static void main(String[] args) {
        simple s = new simple("test");
    }
}
