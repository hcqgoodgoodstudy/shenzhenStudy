package linked;

/**
 * fileName:OneLinked
 * description:
 * author:hcq
 * createTime:2019-03-03 19:17
 */
//单链表  1>>2>>3>>4>>null
 //环状链表  1>>2>>3>>4>>1
public class OneLinked {
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
            this.next=this;
        }
     /*   public Node append(int value){
            Node node=this;
                while(node.next!=null){
                    node=node.next;
                }
                node.next=new Node(value);
                return node.next;
        }*/

        public void removeNext(){
            this.next=this.next.next;
        }
        public void after(int value){
            //环状链表
            //取出下一个节点
            Node last=this.next;//2
            //把新节点作为当前节点的下一个节点
            this.next=new Node(value);//3
            //将下下一个节点作为新节点的下一个节点
            this.next.next=last;
        }
    }

    public static void main(String[] args) {
    }
}
