package class20170716;

/**
 * Created by 程荣凯 on 2017/7/16.
 */
interface Selector{
    boolean end();
    Object current();
    void next();
};
public class Sequence {
    private Object[] o;
    private int next;
    public Sequence(int size){
        o = new Object[size];
    }
    public void add(Object x){
        if(next < o.length)
        {
            o[next] = x;
            next ++;
        }
    }
    private class SSelector implements  Selector{
        int i = 0;
        public boolean end(){
            return i == o.length;
        };
       public Object current(){
            return o[i];
       };
        public void next(){
            if(i<o.length)
            {
                i++;
            }
        };
    }
    public Selector getSelector(){
        return new SSelector();
    }

    public static void main(String[] args) {
        Sequence S = new Sequence(10);
        for(int i=0;i<10;i++)
        {
            S.add(new Integer(i).toString());
        }
        Selector S1 = S.getSelector();
        while (!S1.end()){
            System.out.println(S1.current().toString());
            S1.next();
        }
    }
}
