package class20170723;

/**
 * Created by 程荣凯 on 2017/7/23.
 * 内部类继承
 */
class WithInner{
    class InnerClass{

    }
}
public class InhertInner extends WithInner.InnerClass{
    InhertInner(WithInner withinner){
        withinner.super();
    }

    public static void main(String[] args) {
        WithInner W = new WithInner();
        InhertInner I = new InhertInner(W);

    }
}
