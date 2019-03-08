package tree;
//二叉树
public class BinaryTree {
    //根节点
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    //前序遍历
    public void frontShow() {
         root.frontShow();
    }
    //中序遍历
    public void midShow() {
        root.midShow();
    }
    //后序遍历
    public void afterShow() {
        root.afterShow();
    }
    //前序查找
    public TreeNode  frontSearch(int value){
        return root.frontSearch(value);
    }
    //中序查找
    public TreeNode midSearch(int value){
        return root.midSearch(value);
    }
    //删除
    public void removeNode(int value){
        if(root.value==value){
            root=null;
        }else{
            root.removeNode(value);
        }

    }
}
