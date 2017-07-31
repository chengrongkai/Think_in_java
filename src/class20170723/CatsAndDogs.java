package class20170723;

/**
 * Created by 程荣凯 on 2017/7/23.
 */
import java.util.*;
class Cat {
    private int catNumber;
    Cat(int i) {
        catNumber = i;
    }
    void print() {
        System.out.println("Cat #" + catNumber);
    }
}
class Dog {
    private int dogNumber;
    Dog(int i) {
        dogNumber = i;
    }
    void print() {
        System.out.println("Dog #" + dogNumber);
    }
}
public class CatsAndDogs {
    public static void main(String[] args) {
        Vector cats = new Vector();
        for(int i = 0; i < 7; i++)
            cats.addElement(new Cat(i));
// Not a problem to add a dog to cats:
        cats.addElement(new Dog(7));
        for(int i = 0; i < cats.size()-1; i++)
            ((Cat)cats.elementAt(i)).print();
        ((Dog)cats.elementAt(7)).print();
// Dog is detected only at run-time
    }
} ///:
