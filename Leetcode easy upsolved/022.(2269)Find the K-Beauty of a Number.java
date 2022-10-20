class Solution {
    public int divisorSubstrings(int num, int k) {
        int cur=0,ans=0;
        String sb=String.valueOf(num);
        for(int i=0;i<k;i++){
            cur=cur*10+(sb.charAt(i)-'0');      //to find the value of first num of length k
        }
        if(num%cur==0){
            ans++;
        }
        int div=(int)(Math.pow(10,k-1));
        for(int i=k;i<sb.length();i++){
            cur%=div;      //for removing 1st digit
            cur*=10;
            cur+=(sb.charAt(i)-'0');      //adding the new digit
            if(cur!=0&&num%cur==0){
                ans++;
            }
        }
        return ans;
    }
}
