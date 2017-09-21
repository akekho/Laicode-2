//Given an array of balls, where the color of the balls can only be Red, Green or Blue, sort the balls such that all the Red balls are grouped on the left side, all the Green balls are grouped in the middle and all the Blue balls are grouped on the right side. (Red is denoted by -1, Green is denoted by 0, and Blue is denoted by 1).
//
//Examples
//
//{0} is sorted to {0}
//{1, 0} is sorted to {0, 1}
//{1, 0, 1, -1, 0} is sorted to {-1, 0, 0, 1, 1}
//Assumptions
//
//The input array is not null.
//Corner Cases
//
//What if the input array is of length zero? In this case, we should not do anything as well.

package round1;

public class RainbowSort {
	public int[] rainbowSort (int[] array) {
		if (array.length<=1) {
			return array;
		}
		int neg = 0;
		int zero = 0;
		int one =array.length-1;
		while(zero<one) {
			if (array[zero]==-1) {
				swap(array,zero++,neg++);
			}else if(array[zero]==0) {
				zero++;
			}else {//array[zero]==1}
				swap (array,zero,one--);
			}
		}
		return array;
	}
	private void swap(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		int tmp = array[left];
		array[left]=array[right];
		array[right]=tmp;
		
	}
}
