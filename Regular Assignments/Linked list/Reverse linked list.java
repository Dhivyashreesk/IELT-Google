//Iterative Approach:
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        if(head==null){
            return null;
        }
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
}

//Recursive Approach:
public class Solution {
    public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode newHead = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
}
