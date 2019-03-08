package tree.ArrayBinaryTree;

public class ArrayBinaryTree {
    int[] data;
    ArrayBinaryTree(int[] data){
        this.data=data;
    }
    //前序遍历
    public void frontShow(int index){//index 从第？个节点开始遍历
       if(data==null || data.length==0){
           return ;
       }
       //打印当前节点
        System.out.println(data[index]);
       //左子节点
        int leftIndex=2*index+1;
       //如果存在左子树，递归处理左子树
       if(leftIndex<data.length){
           frontShow(leftIndex);
       }
       //右子节点
        int rightIndex=2*index+2;
        //如果存在右子树，递归处理右子树
       if(rightIndex<data.length){
           frontShow(rightIndex);
       }
    }
}
