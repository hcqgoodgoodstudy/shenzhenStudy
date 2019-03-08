import java.util.HashMap;

public class TestHahMap<T>{
    //默认容量
     static int DEFAULT_INITIAL_CAPACITY=16;
     //最大容量
     static final int MAXIMUM_CAPACITY = 1 << 30;
     //默认负载因数
     static final float DEFAULT_LOAD_FACTORY=0.75f;
    T[] table;
    static class node{
         //用于区分
         public int a;
         node(int a){this.a=a;}
         @Override
         public int hashCode() {
             System.out.println("执行hashcode");
             return 1;
         }

         @Override
         public boolean equals(Object obj) {
             System.out.println("执行equals");
             return false;
         }
     }
    public static void main(String[] args) {

        HashMap<node,node> map=new HashMap();
        for(int i=0;i<=20;i++){
            node no=new node(i);
            map.put(no,no);
        }
    }
}
