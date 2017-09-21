package round2;

public class BinarySearchLastOcc {
	public int LastOccurrence(int[] array,int target){
		if (array==null || array.length==0) {
			return -1;
		}
		int left=0;
		int right = array.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(array[mid]<=target) {
				left=mid;
				//优先缩小左边界 这样不会让第一个漏出去
				//keep doing until the mid is either 
				//at right most or leftmost
			}else {
				right=mid;
			}
		}
		if (array[right]==target) {//先判断right 确保是第一个
			return right;
		}else if (array[left]==target){
			return left;
		}
		return -1;
	}
}
