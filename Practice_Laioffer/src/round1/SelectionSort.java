//Given an array of integers, sort the elements in the array in ascending order. The selection sort algorithm should be used to solve this problem.
//
//Examples
//
//{1} is sorted to {1}
//{1, 2, 3} is sorted to {1, 2, 3}
//{3, 2, 1} is sorted to {1, 2, 3}
//{4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}
//Corner Cases
//
//What if the given array is null? In this case, we do not need to do anything.
//What if the given array is of length zero? In this case, we do not need to do anything.
package round1;
public class SelectionSort {
	public void selectionSort (int[] array) {
		if (array == null) {
			return;
		}
		int min;//global minimum index
		for (int i=0;i<array.length-1;i++) {
			min=i;
			for (int j=i+1;j<array.length;j++) {
				if (array[j]<array[min]) {
					min=j;
				}
			}
			swap(array,i,min);
			
		}
	}

	private void swap(int[] array, int i, int min) {
		// TODO Auto-generated method stub
		int tmp = array[i];
		array[i]=array[min];
		array[min]=tmp;
		
	}
}
