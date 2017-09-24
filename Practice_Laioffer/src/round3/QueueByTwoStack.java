//Java: Implement a queue by using two stacks. The queue should provide size(), isEmpty(), offer(), poll() 
//and peek() operations. When the queue is empty, poll() and peek() should return null.
//
//C++: Implement a queue by using two stacks. The queue should provide size(), isEmpty(), push(), front() and pop() operations. When the queue is empty, front() should return -1.
//
//Assumptions
//
//The elements in the queue are all Integers.
//size() should return the number of elements buffered in the queue.
//isEmpty() should return true if there is no element buffered in the queue, false otherwise.
package round3;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueByTwoStack {
	Deque<Integer> in;
	Deque<Integer> out;
	public QueueByTwoStack() {
		in = new ArrayDeque<Integer>();
		out = new ArrayDeque<Integer>();
	}
	private void move() {
		if(out.isEmpty()) {
			while (!in.isEmpty()) {
				out.push(in.pop());
			}
		}
	}
	public Integer poll() {
		move();
		return out.isEmpty() ? null:out.pop();
	}
	public void offer(int element) {
		in.push(element);
	}
	public Integer peek( ) {
		move();
		return out.isEmpty()?null:out.peek();
	}
	public int size(){
	 	return in.size()+out.size();
	}
	public boolean isEmpty() {
		return in.size()==0 && out.size()==0;
	}
	
}
//boolean	add(E e)
//Inserts the specified element at the end of this deque.
//void	addFirst(E e)
//Inserts the specified element at the front of this deque.
//void	addLast(E e)
//Inserts the specified element at the end of this deque.
//void	clear()
//Removes all of the elements from this deque.
//ArrayDeque<E>	clone()
//Returns a copy of this deque.
//boolean	contains(Object o)
//Returns true if this deque contains the specified element.
//Iterator<E>	descendingIterator()
//Returns an iterator over the elements in this deque in reverse sequential order.
//E	element()
//Retrieves, but does not remove, the head of the queue represented by this deque.
//E	getFirst()
//Retrieves, but does not remove, the first element of this deque.
//E	getLast()
//Retrieves, but does not remove, the last element of this deque.
//boolean	isEmpty()
//Returns true if this deque contains no elements.
//Iterator<E>	iterator()
//Returns an iterator over the elements in this deque.
//boolean	offer(E e)
//Inserts the specified element at the end of this deque.
//boolean	offerFirst(E e)
//Inserts the specified element at the front of this deque.
//boolean	offerLast(E e)
//Inserts the specified element at the end of this deque.
//E	peek()
//Retrieves, but does not remove, the head of the queue represented by this deque, or returns null if this deque is empty.
//E	peekFirst()
//Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
//E	peekLast()
//Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
//E	poll()
//Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
//E	pollFirst()
//Retrieves and removes the first element of this deque, or returns null if this deque is empty.
//E	pollLast()
//Retrieves and removes the last element of this deque, or returns null if this deque is empty.
//E	pop()
//Pops an element from the stack represented by this deque.
//void	push(E e)
//Pushes an element onto the stack represented by this deque.
//E	remove()
//Retrieves and removes the head of the queue represented by this deque.
//boolean	remove(Object o)
//Removes a single instance of the specified element from this deque.
//E	removeFirst()
//Retrieves and removes the first element of this deque.
//boolean	removeFirstOccurrence(Object o)
//Removes the first occurrence of the specified element in this deque (when traversing the deque from head to tail).
//E	removeLast()
//Retrieves and removes the last element of this deque.
//boolean	removeLastOccurrence(Object o)
//Removes the last occurrence of the specified element in this deque (when traversing the deque from head to tail).
//int	size()
//Returns the number of elements in this deque.
//Object[]	toArray()
//Returns an array containing all of the elements in this deque in proper sequence (from first to last element).
//<T> T[]	toArray(T[] a)
//Returns an array containing all of the elements in this deque in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.

