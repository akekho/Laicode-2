package round3;
//Find the middle node of a given linked list.
//
//Examples
//
//L = null, return null
//L = 1 -> null, return 1
//L = 1 -> 2 -> null, return 1
//L = 1 -> 2 -> 3 -> null, return 2
//L = 1 -> 2 -> 3 -> 4 -> null, return 2
//package round3;

public class MiddleNodeOfLinkedList {
	public ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		if (head == null || head.next== null) {
			return head;
		}
		while (fast.next!=null && fast.next.next !=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
}
