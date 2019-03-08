package tree.ArrayBinaryTree;

import java.util.ArrayList;

public class Test {
    //堆排序
    public static void heapSort(int[] arr){
        int begin=(arr.length-1)/2;
        for(int a=begin;a>=0;a--){
            print( arr,arr.length-1,a);
        }
        for(int i=arr.length-1;i>0;i--){
            int max=arr[0];
            arr[0]=arr[i];
            arr[i]=max;
            print(arr,i,0);
        }
    }
    //转换：完全二叉树  从最后一个非叶子节点开始：最后一个节点的父节点
    public static void print(int[] arr,int end,int index){
          //左子节点索引
          int leftNodeindex=index*2+1;
          //右子节点索引
          int rightNodeindex=index*2+2;
         //最大节点索引
          int max=index;
          //找出范围内最大节点
          if(leftNodeindex<end && arr[leftNodeindex]>arr[max]){
              max=leftNodeindex;
          }
          if(rightNodeindex<end && arr[rightNodeindex]>arr[max]){
              max=rightNodeindex;
          }
          //交换位置
         if(max!=index){
              //index处是较小的值   max处是最大的值
              int value=arr[index];
              arr[index]=arr[max];
              arr[max]=value;
              //index处是较大的值  max处是较小的值,可能会破坏以max为顶点的堆，所以需要对max重新排序
             print(arr,end,max);
         }
    }
}
