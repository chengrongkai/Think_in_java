package class20170723;

import class20170616.VarArgs;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by 程荣凯 on 2017/7/25.
 */
class testBill {

    static int[] gerbilNumber = new int[10];

    testBill() {
        for (int i = 0; i < 10; i++) {
            gerbilNumber[i] = (int) (Math.random() * 100);
        }
    }

    public void hop() {
        for (int i = 0; i < gerbilNumber.length; i++) {
            if (gerbilNumber[i] > 10) {
                System.out.println(gerbilNumber[i]);
//            }
            }
        }
    }
}
public class Gerbill {
    public static void main(String[] args) {
        Vector v = new Vector();
        testBill t1 = new testBill();
        v.add(t1);
        testBill t2 = new testBill();
        v.add(t2);
        testBill t3 = new testBill();
        v.add(t3);
//        for (int i = 0; i <v.size() ; i++) {
//            testBill t = (testBill)v.elementAt(i);
//            t.hop();
//        }
        Enumeration E = v.elements();
        while(E.hasMoreElements()){
            ((testBill)E.nextElement()).hop();
        }
    }
}

