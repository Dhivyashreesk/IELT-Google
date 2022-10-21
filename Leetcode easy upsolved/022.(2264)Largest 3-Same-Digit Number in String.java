class Solution {
    public String largestGoodInteger(String s) {
			int max = -1;
			for(int i = 0;i + 2 < s.length();i++){
				if(s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2)){
					int v = s.charAt(i)-'0';
					max = Math.max(max, v);
				}
			}
        if(max == -1)return "";
        
			return "" + max + max + max;
        
    }
}
