/*Input: blocks = "WBBWWBBWBW", k = 7
Output: 3
Explanation:
One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
so that blocks = "BBBBBBBWBW". 
It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
Therefore, we return 3.
*/
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int minFlips=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                minFlips++;
            }
        }
        int windowFlips=minFlips;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i)=='W'){
                windowFlips++;
            }
            if(blocks.charAt(i-k)=='W'){
                windowFlips--;
            }
            minFlips=Math.min(windowFlips,minFlips);
        }
        return minFlips;
    }
}
