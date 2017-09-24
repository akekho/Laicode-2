//Insert a value in a sorted linked list.
//
//Examples
//
//L = null, insert 1, return 1 -> null
//L = 1 -> 3 -> 5 -> null, insert 2, return 1 -> 2 -> 3 -> 5 -> null
//L = 1 -> 3 -> 5 -> null, insert 3, return 1 -> 3 -> 3 -> 5 -> null
//L = 2 -> 3 -> null, insert 1, return 1 -> 2 -> 3 -> null

package round3;

public class InsertInSortedArray {
	public ListNode insertInSortedArray(ListNode head, int value) {
		ListNode newNode = new ListNode(value);
		if (head == null||head.value>=value) {
			newNode.next = head;
			return newNode;
		}
		ListNode pre = head;
		ListNode next = head.next;
		
		while (next!= null && pre.value<value) {
			pre=pre.next;
			next=next.next;
		}
		newNode.next = next;
		pre.next=newNode;
		return head;
		
	}
}
