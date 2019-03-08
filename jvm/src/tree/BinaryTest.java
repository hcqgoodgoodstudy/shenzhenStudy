package tree;

public class BinaryTest {
    public static void main(String[] args) {
        //实例化一颗树：空树
        BinaryTree tree=new BinaryTree();
        //为tree实例化root节点
         tree.setRoot(new TreeNode(1));
         TreeNode rootl=new TreeNode(2);
         TreeNode rootr=new TreeNode(3);
         tree.getRoot().setlNode(rootl);
         tree.getRoot().setrNode(rootr);

         //添加节点
        rootl.setlNode(new TreeNode(4));
        rootl.setrNode(new TreeNode(5));
        rootr.setlNode(new TreeNode(6));
        rootr.setrNode(new TreeNode(7));
       //前序遍历
        // tree.frontShow();
        //tree.midShow();
       //前序查找
        // TreeNode node=tree.frontSearch(3);
       //中序查找
        TreeNode node=tree.midSearch(3);
        System.out.println(node);
        //删除节点
        tree.removeNode(3);
        TreeNode node2=tree.midSearch(3);
        System.out.println(node2);

    }
}
