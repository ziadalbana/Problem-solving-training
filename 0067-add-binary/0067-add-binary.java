class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1,j=b.length()-1;
        int carry=0;
        StringBuilder res=new StringBuilder();
        while(i>=0&&j>=0){
            char a1=a.charAt(i--);
            char b2=b.charAt(j--);
            if(a1=='1'&&b2=='1'&&carry==1){
                res.insert(0,'1');
                carry=1;
            }else if(a1=='1'&&b2=='1'&&carry==0){
                res.insert(0,'0');
                carry=1;
            }else if((a1=='1'||b2=='1')&&carry==1){
                res.insert(0,'0');
                carry=1;
            }else if((a1=='1'||b2=='1')&&carry==0){
                  res.insert(0,'1');
                carry=0;
            }else if((a1=='0'&&b2=='0')&&carry==1){
                  res.insert(0,'1');
                carry=0;
            }else{
                res.insert(0,'0');
                carry=0;
            }
        }
        while(i>=0){
           char a1=a.charAt(i--);
            if(a1=='1'&&carry==1){
                res.insert(0,'0');
                carry=1;
            }
            else if(a1=='1'||carry==1){
                res.insert(0,'1');
                carry=0;
            }else{
                 res.insert(0,'0');
            }
        }
        while(j>=0){
           char a1=b.charAt(j--);
            if(a1=='1'&&carry==1){
                res.insert(0,'0');
                carry=1;
            }
            else if(a1=='1'||carry==1){
                res.insert(0,'1');
                carry=0;
            }else{
                 res.insert(0,'0');
            }
        }
        if(carry==1) res.insert(0,'1');
        return res.toString();
        
    }
}