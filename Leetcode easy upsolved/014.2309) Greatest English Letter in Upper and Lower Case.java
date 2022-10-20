class Solution {
    public String greatestLetter(String s) {
        int freq[]=new int[127];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        String ans="";
        for(int i='A';i<='Z';i++){
            if(freq[i]>=1 && freq[i+32]>=1){
                char ch=(char)i;
                ans=Character.toString(ch);
            }
        }
        return ans;
    }
}
