class Solution {
    public int fillCups(int[] A) {
       Arrays.sort(A);
       int x=A[0];
       int y=A[1];
       int z=A[2];
       int sum=x+y+z;
       if(x+y>z){
           return (sum/2)+(sum%2);
       }else if(x==0 && y==0){
           return z;
       }else{
           return z;
       }
    }
}
