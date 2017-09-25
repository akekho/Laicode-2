//Implement an iterative, pre-order traversal of a given binary tree, return the list of keys of each node in the tree as it is pre-order traversed.
//
//Examples
//
//        5
//
//      /    \
//
//    3        8
//
//  /   \        \
//
//1      4        11
//
//Pre-order traversal is [5, 3, 1, 4, 8, 11]
//
//Corner Cases
//
//What if the given binary tree is null? Return an empty list in this case.
//How is the binary tree represented?
//
//We use the level order traversal sequence with a special symbol "#" denoting the null node.
//
//For Example:
//
//The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
//
//    1
//
//  /   \
//
// 2     3
//
//      /
//
//    4
//
// 
package round4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

//public class PreOrderBinaryTree {
//	public List<Integer> preOrder(TreeNode root) {
//		List<Integer> result = new ArrayList<>();
//		if (root==null) {
//			return result;
//		}
//		helper(result,root);
//		return result;
//	
//	}
//
//	private void helper(List<Integer> result, TreeNode root) {
//		if(root==null) {
//			return;
//		}
//		// TODO Auto-generated method stub
//		result.add(root.key);
//		helper(result,root.left);
//		helper(result,root.right);
//		
//	}
//
//}
//
//public class PreOrderBinaryTree {
//	public List<Integer> preOrder(TreeNode root) {
//		List<Integer> result = new ArrayList<>();
//		if (root==null) {
//			return result;
//		}
//		Deque<TreeNode> preOrder = new ArrayDeque<>();
//		preOrder.offerFirst(root);
//		while (!preOrder.isEmpty()) {
//			TreeNode cur = preOrder.pollFirst();
//			if(cur.right!=null) {//LIFO so we should push right in first
//				preOrder.offerFirst(cur.right);//offer=offerLast
//			}
//			if(cur.left!=null) {
//				preOrder.offerFirst(cur.left);
//			}
//			result.add(cur.key);
//		}
//		
//		return result;
//	}
//mine
	public class PreOrderBinaryTree {
		public List<Integer> preOrder(TreeNode root) {
			List<Integer> result = new ArrayList<>();
			if (root==null) {
				return result;
			}
			Deque<TreeNode> preOrder = new ArrayDeque<>();
			preOrder.offerFirst(root);
			while (!preOrder.isEmpty()) {
				root = preOrder.pollFirst();
				result.add(root.key);
				if(root.right!=null) {//LIFO so we should push right in first
					preOrder.offerFirst(root.right);//offer=offerLast
				}
				if(root.left!=null) {
					preOrder.offerFirst(root.left);
				}
			}
			
			return result;
		}
	
}
