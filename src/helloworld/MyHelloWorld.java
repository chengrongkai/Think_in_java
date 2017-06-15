package helloworld;

/**
 * Created by 程荣凯 on 2017/6/11.
 */
public class MyHelloWorld {
    public static void main(String[] args) {
//        print("程荣凯");
        printAll("程荣凯","15623826795");
    }
    public static void print(String name){
        System.out.println("hello,"+name);
    }
    public static void printAll(String name,String phone){
        System.out.println("hello,"+name);
        System.out.println("你的电话是,"+phone);
    }

}
