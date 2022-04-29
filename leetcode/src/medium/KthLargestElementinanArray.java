package medium;

import java.util.*;

public class KthLargestElementinanArray {
    public static void main(String[] args) {
       KthLargestElementinanArray n =new KthLargestElementinanArray();
       System.out.println( n.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
    }
    public int findKthLargest(int[] nums, int k) {
       return Rand_Selection(nums,0,nums.length-1,nums.length-k);
    }
    public int Rand_Selection(int[] arr,int l,int r,int ith){
        if (l==r) return arr[l];
        int index = partition(arr, l, r);
        int k=index-l+1;
        if(ith==k)  return arr[index];
        if (ith<k)  return Rand_Selection(arr, l, index - 1,ith);
        else      return Rand_Selection(arr, index + 1, r,ith-k);
    }
    private int partition(int[] arr,int l,int r){
        int povit=arr[l];
        int i=l;
        for (int j = l+1; j <=r; j++) {
            if (arr[j]<povit){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i,l);
        return i;
    }
    private  void swap(int[] arr,int current,int destenation){
        int temp=arr[current];
        arr[current]=arr[destenation];
        arr[destenation]=temp;
    }
}
