package class20170622;
import java.util.ArrayList;
import java.util.List;
/**
 * 二叉树创建与遍历
 * Created by 程荣凯 on 2017/6/22.
 */
class TNode{
    String value;
    TNode left,right;
    int level;
    TNode(String value,TNode left,TNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
public class DoubleTree {
    static String[] array = {"A","B","D","G","H","C","F"};
//    private static List<TNode> nodeList = null;
    public static void main(String[] args) {
        TNode test = createTree(array,0,0);
        System.out.println("中序遍历:");
        inOrder(test);
        System.out.println("前序遍历:");
        frontOrder(test);
        System.out.println("后序遍历:");
        backOrder(test);
//        ArrayList LIST = getTreeLevel(test,0);
          ArrayList LIST1 = getTreeLevel(test,1);
//        ArrayList LIST2 = getTreeLevel(test,2);
    }
    static TNode createTree(String[] array,int index,int level){
        TNode tNode = null;
        if(index <array.length)
        {
            tNode = new TNode(array[index],null,null);
            tNode.left = createTree(array,index*2+1,level+1);
            tNode.right = createTree(array,index*2+2,level+1);
            tNode.level = level;
        }
       return tNode;
    }

    /**
     * 中序遍历
     * @param tnode 二叉树
     */
    static void inOrder(TNode tnode){
        if(tnode == null)
        {
            return;
        }
        inOrder(tnode.left);
        System.out.println("值:"+tnode.value+",层次:"+tnode.level);
        inOrder(tnode.right);
    }

    /**
     * 前序遍历
     * @param tnode 二叉树
     */
    static void frontOrder(TNode tnode){
        if(tnode == null)
        {
            return;
        }
        System.out.println("值:"+tnode.value+",层次:"+tnode.level);
        frontOrder(tnode.left);
        frontOrder(tnode.right);
    }

    /**
     * 后序遍历
     * @param tnode 二叉树
     */
    static void backOrder(TNode tnode){
        if(tnode == null)
        {
            return;
        }
        backOrder(tnode.left);
        backOrder(tnode.right);
        System.out.println("值:"+tnode.value+",层次:"+tnode.level);
    }

    /**
     * 根据二叉树和二叉树的层次
     * @param tNode
     * @param level
     * @return 指定层次的节点
     */
    static ArrayList getTreeLevel(TNode tNode,int level){
        if(null == tNode)
        return null;
        ArrayList list = new ArrayList();
        int index = 0;
        while (index <= level) {
            if (level == index) {
                list.add(tNode.value);
                System.out.println(tNode.value);
                break;
            }
            else {
                    index++;
                if(level == index)
                {
                    if(null != tNode.left) {
                        list.add(tNode.left.value);
                        System.out.println(tNode.left.value);
                    }
                    if(null != tNode.right) {
                        list.add(tNode.right.value);
                        System.out.println(tNode.right.value);
                    }
                    break;
                }
               else
                {
                    index++;
                }
                }
            }
        return list;
    }
}
