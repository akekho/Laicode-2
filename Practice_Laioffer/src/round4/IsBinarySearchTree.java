//Determine if a given binary tree is binary search tree.
//
//Assumptions
//
//There are no duplicate keys in binary search tree.
//You can assume the keys stored in the binary search tree can not be Integer.MIN_VALUE or Integer.MAX_VALUE.
//Corner Cases
//
//What if the binary tree is null? Return true in this case.
package round4;

public class IsBinarySearchTree {
	public boolean isBST (TreeNode root) {
//		if (root==null) {
//			return false;
//		}
		return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	private boolean isBST(TreeNode root, int minValue, int maxValue) {
		// TODO Auto-generated method stub
		if(root==null) {
			return true;
		}
		if((root.key<=minValue)||(root.key>=maxValue)) {
			return false;
		}
		return (isBST (root.left,minValue,root.key)&&isBST(root.right,root.key,maxValue));

	}
}

	
