import java.util.Scanner;
class HelloWorld {
    public static int maxSumSubarr(int arr[]){
        int maxEnd=0;
        int maxSoFar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxEnd+=arr[i];
            if(maxEnd<arr[i]){
                maxEnd=arr[i];
            }
            if(maxEnd>maxSoFar){
                maxSoFar=maxEnd;
            }
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
      System.out.print(maxSumSubarr(arr));
    }
}
//Time Complexity: O(N);
