package round3;
//Check if a given linked list has a cycle. Return true if it does, otherwise return false.


public class CheckCycle {
	public boolean checkCycle (ListNode head) {
		if (head==null || head.next == null){
	        return false;
	     }
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next!=null&&fast.next.next!=null) {
			slow=slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}
	
}
