class Solution {
    public boolean isHappy(int num) {
    if(num==1) return true;
    // HashSet<Integer> set=new HashSet<>();
    // while(num!=1){
    //   num =getNum(num);
    //   if(!set.add(num)) return false;
    // }
    // return true;
    int slow=num,fast=num;
    do{
       slow=getNum(slow);
       fast=getNum(getNum(fast));
    }while(slow!=fast);
    return slow==1;    
  }
  private int getNum(int num){
    int sum=0,temp=0;;
    while(num>0){
      temp=num%10;
      sum+=temp*temp;
      num/=10;
    }
    return sum;
  }
}