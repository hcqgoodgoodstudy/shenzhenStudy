package tree.sortTree;

/**
 * fileName:BinarySortTree
 * description:
 * author:hcq
 * createTime:2019-03-05 19:13
 */

public class BinarySortTree {
    Node root;
    public void add(int value){
        if(root!=null){
            root.add(value);
        }else{
            root=new Node(value);
        }
    }
    public void show(){
        if(root!=null){
            root.show();
        }else{
            System.out.println("null");
        }
    }
    public Node get(int value){
        if(root!=null){
           return root.get(value);
        }
        return null;
    }
    public void remove(int value){
        if(root==null){
            return ;
        }else{
            Node target=get(value);
            if(target==null){//没有找到需要删除的节点
                return ;
            }else{
                Node parent=root.getParent(value);
                if(target.left==null&&target.right==null){//删除叶子节点
                    if(parent.left.value==value){
                        parent.left=null;
                    }else{
                        parent.right=null;
                    }
                }else{
                    if(target.right!=null&&target.left!=null){//需要删除的节点有两个子节点
                         //删除右子树中最小的，并取到值
                        int min=deleteMin(target.right);
                        //替换目标节点中的值
                        target.value=min;
                    }else{//需要删除的节点有一个节点
                        if(target.left!=null && parent.left.value==value){//需要删除的是左节点
                            parent.left=target.left;
                        }
                        if(target.right!=null && parent.right.value==value){//需要删除的是右节点
                            parent.right=target.right;
                        }

                    }
                }

            }
        }
    }

    private int deleteMin(Node node) {
        Node min=node;
        while(min.left!=null){
            min=min.left;
        }
        //删除最小节点
        remove(min.value);
        return min.value;
    }

    public static void main(String[] argTs) {
        int[] arr={1,2,3,4,5,6,7,8};
        BinarySortTree sortTree=new BinarySortTree();
        for (int i : arr) {
            sortTree.add(i);
        }
        sortTree.show();
        System.out.println(sortTree.root.height());
    }
}
