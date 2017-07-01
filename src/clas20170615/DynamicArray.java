package clas20170615;

/**
 * Created by 程荣凯 on 2017/6/15.
 */
public class DynamicArray {
    public static void main(String[] args) {
        String[] str = {"1","2","3","4"};
//        for (int i=0;i<str.length;i++)
//        {
//            System.out.println(str[i]);
//        }
        test1 t1 = new test1(str);
        String[] aa = t1.testArray;
        for (int i=0;i<aa.length;i++)
        {
            System.out.println(aa[i]);
        }
    }
}
class test1{
    String[] testArray;
    test1(String[] str){
        testArray = str;
        for (int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }
    }
}