package tree.sortTree;

/**
 * fileName:Node
 * description:
 * author:hcq
 * createTime:2019-03-05 19:07
 */

public class Node {
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value=value;
    }
    public void add(int value){
        if(value<this.value){//值小于当前节点时,比较左子节点
             if(left!=null){
                 left.add(value);
             }else{
                 left=new Node(value);
             }
        }else{
            if(right!=null){
                right.add(value);
            }else{
                right=new Node(value);
            }
        }
        //进行平衡检查
        int lh=0;//左子树高度
        int rh=0;//右子树高度
         if(left!=null){
             lh=left.height();
         }
         if(right!=null){
             rh=right.height();
         }
        //左子树高度大于右子树高度  进行右旋转
         if(lh-rh>1){
             rightRotate();
         }
         if(rh-lh>1){
             leftRotate();
         }
    }
    //左旋
    private void leftRotate(){
        //创建新节点
        Node node=new Node(value);
        //使原来的右子节点的左子节点作为新树的右子节点
        node.right=right.left;
        //使需要旋转的树的根节点值变为右子节点的值
        value=right.value;
        //使根节点的右子树变为原来右子树的右子树
        right=right.right;
        //将新树作为根节点的左子树
        left=node;

    }
    //右旋
    private void rightRotate() {
         //创建新节点
         Node node=new Node(value);
         //使新节点的右子树等于原来的右子树
        node.right=right;
         //使原来的左子树的右子节点变为新树的左子节点
         node.left=left.right;
         //使需要旋转的树的根节点值变为左子节点的值
        this.value=left.value;
         //使原来的左子节点变为左子节点的左子树
         this.left=this.left.left;
         //使原来的右子节点变为新树
          this.right=node;
    }

    public Node get(int value){
        if(this.value==value){
            return this;
        }
        if(value<this.value){//值小于当前节点时,比较左子节点
            if(left!=null){
               return left.get(value);
            }
        }else{
            if(right!=null){
                return right.get(value);
            }
        }
        return null;
    }
    public int height(){
        return Math.max(left==null ? 0 :left.height(),right==null ? 0 : right.height())+1;
    }
    public Node getParent(int value){
        if((this.left!=null&&left.value==value)||(this.right!=null&&right.value==value)){
            return this;
        }else{
            if(this.value<value&&this.right!=null){
               return right.getParent(value);
            }
            if(this.value>value&&this.left!=null){
               return left.getParent(value);
            }
        }
        return null;
    }
    public void show() {
        if(left!=null){
            left.show();
        }
        System.out.println(this.value);
        if(right!=null){
            right.show();
        }
    }
}
