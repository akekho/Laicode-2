package round2;

public class SearchInSortedMatrix {
	public int[] search(int[][] matrix, int target) {
	    // Write your solution here.
	    if (matrix.length == 0 || matrix[0].length == 0) {
	      return new int[] {-1, -1};
	    }
	    int rows = matrix.length;
	    int cols = matrix[0].length;
	    int end = cols * rows-1;
	    int start = 0;
	    while (start<=end) {
	    		int mid = start + (end-start)/2;
	    		int row = mid/cols;
	    		int col = mid%cols;
	    		if (matrix[row][col]==target) {
	    			return new int[] {row,col};
	    		}else if (matrix[row][col]>target) {
	    			end=mid-1;
	    		}else {
	    			start=mid+1;
	    		}
	    }
	    return new int[] {-1,-1};	
	}
}
