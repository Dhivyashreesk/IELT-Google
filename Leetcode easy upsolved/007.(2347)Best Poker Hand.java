class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int max=0,suit=0;
        char ch=suits[0];
        int count[]=new int[14];
        for(int i=0;i<5;i++){
            count[ranks[i]]++;
            max=Math.max(max,count[ranks[i]]);
            if(suits[i]==ch) suit++;
        }
        if(suit==5)  return "Flush";
        return max>=3?"Three of a Kind":max==2?"Pair":"High Card";
    }
}
