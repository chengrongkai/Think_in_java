package class20170616;

/**
 * Created by 程荣凯 on 2017/6/16.
 */
class A{}
public class VarArgs {
    static void printArray(Object[] args){
        for (Object obj:args){
            System.out.println(obj+"");
        }
    }

    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47),new Float(3.14),new Double(11.11)
        });
        printArray(new Object[]{
                "one","two","three"
        });
        printArray(new Object[]{
                new A(),new A(),new A()
        });
    }
}
