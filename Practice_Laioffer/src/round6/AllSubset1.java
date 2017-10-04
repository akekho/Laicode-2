//Given a set of characters represented by a String, return a list containing all subsets of the characters.
//
//Assumptions
//
//There are no duplicate characters in the original set.
//​Examples
//
//Set = "abc", all the subsets are [“”, “a”, “ab”, “abc”, “ac”, “b”, “bc”, “c”]
//Set = "", all the subsets are [""]
//Set = null, all the subsets are []

package round6;

import java.util.ArrayList;
import java.util.List;

public class AllSubset1 {
	public List<String> subSets(String set) {
	    List<String> result = new ArrayList<String>();
	    if (set == null){
	    		return result;
	    }
	    char[] arraySet = set.toCharArray();
	    StringBuilder sb = new StringBuilder();
	   // helper1 (arraySet,sb,0,result);
	    helper2(arraySet,sb,0,result);
	    return result;
	    
	  }

	

	private void helper1(char[] set, StringBuilder sb, int index, List<String> result) {
		// TODO Auto-generated method stub
		if (index ==  set.length) {
			result.add(sb.toString());
			return;
		}
		//1.not pick the character at index.
		helper1(set,sb,index+1,result);
		//2.pick the character at index.
		helper1(set,sb.append(set[index]),index+1,result);
		sb.deleteCharAt(sb.length()-1);
	}
	private void helper2(char[] set, StringBuilder sb, int index, List<String> result) {
		// TODO Auto-generated method stub
		result.add(sb.toString());
		//maintains ascending order of the indices of pickedd characters;
		//choose the next picked index( the smallest one can be picked is index)
		for (int i = index; i < set.length; i++) {
			sb.append(set[i]);
			helper2(set,sb,i+1,result);
			sb.deleteCharAt(sb.length()-1);
		}
	}

}
