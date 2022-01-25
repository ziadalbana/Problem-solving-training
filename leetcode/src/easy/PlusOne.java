package easy;

import java.util.ArrayList;
import java.util.Stack;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        Stack<Integer> holder=new Stack<>();
        int firstDigit=digits[digits.length-1]+1;
        int sum=firstDigit%10;
        int carry=firstDigit/10;
        holder.add(sum);
        for (int i = digits.length-2; i >=0 ; i--) {
             int temp=digits[i]+carry;
             sum=temp%10;
             carry=temp/10;
             holder.add(sum);
        }
        if (carry==1) holder.add(1);
        int[] result=new int[holder.size()];
       int i=0;
        while (!holder.isEmpty()){
           result[i++]=holder.pop();
        }
      return result;
    }
}
