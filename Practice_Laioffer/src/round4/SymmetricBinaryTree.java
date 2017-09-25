//Check if a given binary tree is symmetric.
//
//Examples
//
//        5
//
//      /    \
//
//    3        3
//
//  /   \    /   \
//
//1      4  4      1
//
//is symmetric.
//
//        5
//
//      /    \
//
//    3        3
//
//  /   \    /   \
//
//1      4  1      4
//
//is not symmetric.
package round4;

public class SymmetricBinaryTree {
	  public boolean isSymmetric(TreeNode root) {
		    if (root ==null) {
		      return true;
		    }
		    return isSymmetric(root.left,root.right);
	  }

	private boolean isSymmetric(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
		if (left==null && right==null) {
			return true;
		}
		if(left==null || right== null) {
			return false;
		}
		if(left.key != right.key) {
			return false;
		}
		return(isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left));
	}
}
