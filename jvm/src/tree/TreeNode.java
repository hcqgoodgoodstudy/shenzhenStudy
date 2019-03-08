package tree;
//二叉树节点
public class TreeNode {
    //左儿子
    TreeNode lNode;
    //节点的权
    int value;
    //右儿子
    TreeNode rNode;
    public TreeNode(int value){
        this.value=value;
    }

    public void setlNode(TreeNode lNode) {
        this.lNode = lNode;
    }

    public void setrNode(TreeNode rNode) {
        this.rNode = rNode;
    }
    //前序遍历
    public void frontShow() {
        //遍历root
        System.out.println(value);
        //左节点
        if(lNode!=null){
            lNode.frontShow();
        }
        //右节点
        if(rNode!=null){
            rNode.frontShow();
        }
    }
    //中序遍历
    public void midShow(){
        if(lNode!=null){
            lNode.midShow();
        }
        System.out.println(value);
        if(rNode!=null){
           rNode.midShow();
        }
    }
    //后序遍历
    public void afterShow(){
        if(lNode!=null){
            lNode.afterShow();
        }
        if(rNode!=null){
            rNode.afterShow();
        }
        System.out.println(value);
    }
    //前序查找
    public TreeNode frontSearch(int value) {
          TreeNode target=null;
          //对比当前节点的值
          if(this.value==value){
              return this;
          }else{
              //左儿子存在时，向左查找
              if(lNode!=null){
                  target=lNode.frontSearch(value);
              }
              //从左边找到了目标时，将目标返回
             if(target!=null){
                 return target;
             }
             //左边找不到目标时向右查找
             if(rNode!=null){
                 target=rNode.frontSearch(value);
             }
             return target;
          }
    }
    //中序查找
    public TreeNode midSearch(int value) {
        TreeNode target=null;
            //先从左子节点开始查找
            if(lNode!=null){
                target=lNode.midSearch(value);
            }
            //从左边找到了目标时，将目标返回
            if(target!=null){
                return target;
            }
            //查找当前节点
            if(this.value==value){
                return this;
            }
            //最后向右子节点进行查找
            if(rNode!=null){
                target=rNode.midSearch(value);
            }
            return target;
    }

    //删除节点
    public void removeNode(int value){
        //存放父节点
        TreeNode parent=this;

        //删除左节点
        if(lNode!=null && lNode.value==value){
            parent.lNode=null;
            return ;
        }
        //删除右节点
        if(rNode!=null && rNode.value==value){
            parent.rNode=null;
            return ;
        }

        //递归向下删除
        if(lNode!=null){//左子节点
            parent=parent.lNode;
            parent.removeNode(value);
        }
        if(lNode!=null){//右子节点
            parent=parent.rNode;
            parent.removeNode(value);
        }

    }
}
