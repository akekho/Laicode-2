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
