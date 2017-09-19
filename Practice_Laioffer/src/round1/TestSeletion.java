package round1;

import java.util.Arrays;

public class TestSeletion {
	public static void main (String[] args) {
		SelectionSort solution = new SelectionSort();
		int[] array = null;
		solution.selectionSort(array);
		System.out.println(Arrays.toString(array));
		int[] array1 = {1,4,3,2};
		solution.selectionSort(array1);
		System.out.println(Arrays.toString(array1));
		int[] array2 = {5};
		solution.selectionSort(array2);
		System.out.println(Arrays.toString(array2));
		int[] array3 = {-1,-4,4,-5};
		solution.selectionSort(array3);
		System.out.println(Arrays.toString(array3));
		int[] array4 = {6,6,6,6};
		solution.selectionSort(array4);
		System.out.println(Arrays.toString(array4));
	}
}
