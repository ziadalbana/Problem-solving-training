class Solution {
    public String addStrings(String num1, String num2) {
        int l1=num1.length()-1,l2=num2.length()-1;
        int carry=0;
        StringBuilder res=new StringBuilder();
        while(l1>=0&&l2>=0){
            int n1=num1.charAt(l1--)-'0';
            int n2=num2.charAt(l2--)-'0';
            int sum=n1+n2+carry;
            res.insert(0,sum%10);
            carry=sum/10;
        }
        while(l1>=0){
            int n1=num1.charAt(l1--)-'0';
            int sum=n1+carry;
            res.insert(0,sum%10);
            carry=sum/10;
        }
         while(l2>=0){
            int n1=num2.charAt(l2--)-'0';
            int sum=n1+carry;
            res.insert(0,sum%10);
            carry=sum/10;
        }
        if(carry>0) res.insert(0,carry);
        return res.toString();
    }
}