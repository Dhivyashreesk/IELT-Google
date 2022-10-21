class Solution {
    public char repeatedCharacter(String s) {
        int freq[]=new int[26];
        int n=s.length(),i;
        for(i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            if(freq[s.charAt(i)-'a']==2){
                break;
            }
        }
        return s.charAt(i);
    }
}
