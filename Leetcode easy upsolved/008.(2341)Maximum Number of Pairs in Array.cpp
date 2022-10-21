class Solution {
public:
    vector<int> numberOfPairs(vector<int>& nums) {
        int count[101]={0};
        int pairs=0,leftOver;
        for(int i=0;i<nums.size();i++){
            count[nums[i]]++;
            if(count[nums[i]]==2){
                pairs++;
                count[nums[i]]=0;
            }
        }
        leftOver=nums.size()-(pairs*2);
        return {pairs,leftOver};
    }
};
