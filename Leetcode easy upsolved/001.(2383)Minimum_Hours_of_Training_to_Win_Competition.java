/*Input: initialEnergy = 5, initialExperience = 3, energy = [1,4,3,2], experience = [2,6,3,1]
Output: 8
Explanation: You can increase your energy to 11 after 6 hours of training, and your experience to 5 after 2 hours of training.
You face the opponents in the following order:
- You have more energy and experience than the 0th opponent so you win.
  Your energy becomes 11 - 1 = 10, and your experience becomes 5 + 2 = 7.
- You have more energy and experience than the 1st opponent so you win.
  Your energy becomes 10 - 4 = 6, and your experience becomes 7 + 6 = 13.
- You have more energy and experience than the 2nd opponent so you win.
  Your energy becomes 6 - 3 = 3, and your experience becomes 13 + 3 = 16.
- You have more energy and experience than the 3rd opponent so you win.
  Your energy becomes 3 - 2 = 1, and your experience becomes 16 + 1 = 17.
You did a total of 6 + 2 = 8 hours of training before the competition, so we return 8.
It can be proven that no smaller answer exists.
*/
class Solution {
    public int minNumberOfHours(int ie, int ig, int[] energy, int[] experience) {
        int hours=0;
        for(int i=0;i<energy.length;i++){
            if(energy[i]>=ie){
                hours+=energy[i]-ie+1;
                ie+=energy[i]-ie+1;
            }
            if(experience[i]>=ig){
                hours+=experience[i]-ig+1;
                ig+=experience[i]-ig+1;
            }
            ie-=energy[i];
            ig+=experience[i];
        }
        return hours;
    }
}
