class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        int len=nums.length;
        for(int i=0;i<len- 2;i++){
            for(int j=i+1;j<len-1;j++) {
                for(int k=j+1;k<len;k++) {
                    if((nums[j]-nums[i]==diff) && (nums[k]-nums[j]==diff)) {
                        count+=1;
                }
              }
            }
        }
        return count;
    }
}
