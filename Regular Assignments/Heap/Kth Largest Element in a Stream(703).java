class KthLargest {
    PriorityQueue<Integer> queue= new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
    for( int a: nums){
				queue.add(a);           //add all the elements in pq 
    }
        this.k=k;   //pointing k to global k
    }
    
    public int add(int val) {
        queue.add(val);         //adding value in pq  no need to take care of nums array
        
        while(queue.size()>k){      //remove all the elements which we dont need  
				queue.remove();       // making the window of k size
        }
        return queue.peek();   //returning the peek element of queue
        
    }
}
