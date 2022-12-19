class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)->a.val-b.val);
        ListNode temp = new ListNode(-1);
        ListNode head=temp;
        for(ListNode list:lists) {
            while(list!=null) {
                minHeap.add(list);
                list=list.next;
            }
        }
        while(!minHeap.isEmpty()) {
            temp.next=minHeap.poll();
            temp=temp.next;
            temp.next=null;
        }
        return head.next;
    }
}
