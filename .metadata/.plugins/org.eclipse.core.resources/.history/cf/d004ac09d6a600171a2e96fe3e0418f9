/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
//Reverse a singly-linked list.
//
//Examples
//
//L = null, return null
//L = 1 -> null, return 1 -> null
//L = 1 -> 2 -> 3 -> null, return 3 -> 2 -> 1 -> null

package round3;

public class ReverseLinkedList {
	public ListNode reverse(ListNode head) {
		ListNode pre = null;
		while (head!=null) {
			ListNode next=head.next;
			head.next=pre;
			pre = head;
			head=next;
		}
		return  pre;
	}
}

