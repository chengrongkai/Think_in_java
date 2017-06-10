package createObj;

import java.lang.reflect.Constructor;

/**
 * Created by 程荣凯 on 2017/6/10.
 */
public class createObjTest {
    public static void main(String[] args)
    {
        createByNew("createByNew");
        createByConstructorNewInstance("createByConstructorNewInstance");
        createByNewInstance1("createByNewInstance1");
        createByNewInstance2("createByNewInstance2");
    }

    /**
     * 通过new关键字新建对象
     * @param str 打印参数
     */
    public static void createByNew(String str)
    {
        testClass test = new testClass();
        test.print(str);
    }

    /**
     * 通过构造方法新建对象
     * @param str 打印参数
     */
    public static void  createByConstructorNewInstance(String str)
    {
//        testClass test = (testClass) Class.forName("testClass").newInstance();
       try {
           Constructor<testClass> constructor = testClass.class.getConstructor();
           testClass test = constructor.newInstance();
           test.print(str);
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }

    }

    /**
     * 通过newInstance新建对象
     * @param str 打印参数
     */
    public static void  createByNewInstance1(String str)
    {
//        testClass test = (testClass) Class.forName("testClass").newInstance();
        try {
            testClass test = (testClass) Class.forName("createObj.testClass").newInstance();
            test.print(str);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    /**
     * 通过newInstance新建对象
     * @param str 打印参数
     */
    public static void  createByNewInstance2(String str)
    {
//        testClass test = (testClass) Class.forName("testClass").newInstance();
        try {
            testClass test = testClass.class.newInstance();
            test.print(str);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    // By using clone() method
    // By using Deserialization
}
