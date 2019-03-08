package linked;

/**
 * fileName:doubbleLinked
 * description:
 * author:hcq
 * createTime:2019-03-03 19:16
 */
//双向环状链表
public class doubbleLinked {
    static class Node{
        int value;
        Node next;
        Node before;
        Node(int value){
            this.value=value;
            this.next=this;
            this.before=this;
        }
      public void after(int value){
            //获取当前节点的下一个节点
         Node oldNext=this.next;
          //创建新节点
         Node newNode=new Node(value);
         //建立当前节点与新节点的双向链接
          newNode.before=this;
          this.next=newNode;
         //建立原来的下一个节点与新节点的双向链接
          newNode.next=oldNext;
          oldNext.before=newNode;
        }
        public Node getNext(){
            return this.next;
        }
        public Node getBefore(){
            return this.before;
        }
    }
}
