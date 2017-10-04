//Given a string with no duplicate characters, return a list with all permutations of the characters.
//
//Examples
//
//Set = “abc”, all permutations are [“abc”, “acb”, “bac”, “bca”, “cab”, “cba”]
//Set = "", all permutations are [""]
//Set = null, all permutations are []
package round6;

import java.util.ArrayList;
import java.util.List;

public class AllValidPermutation1 {
	public List<String> permutations (String set){
		List<String> result = new ArrayList<String>();
		if (set == null) {
			return result;
		}
		char[] array =  set.toCharArray();
		helper(array,0,result);
		return result;
	}

	private void helper(char[] array, int index, List<String> result) {
		// TODO Auto-generated method stub
		if (index == array.length) {
			result.add(new String(array));
			return;
		}
		for (int i = index;i < array.length;i++) {
			swap(array,index,i);
			helper(array,index+1,result);
			swap(array,index,i);
		}
	}
	private void swap(char[] array,int left, int right) {
		char tmp = array[left];
		array[left]=array[right];
		array[right]=tmp;
	}
}

