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