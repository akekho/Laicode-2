//Given N pairs of parentheses “()”, return a list with all the valid permutations.
//
//Assumptions
//
//N >= 0
//Examples
//
//N = 1, all valid permutations are ["()"]
//N = 3, all valid permutations are ["((()))", "(()())", "(())()", "()(())", "()()()"]
//N = 0, all valid permutations are [""]
package round6;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationsOfParentheses1 {
	public List<String> validParentheses(int n) {
	    // Write your solution here.
	    List<String> result = new ArrayList<String>();
	    char[] cur = new char[n*2];
	    helper(cur,n,n,0,result);
	    return result;
	  }
	//left : how many '(' we still have
	// right ')'
	//index: the current position in cur we want to fill in with either '(' or ')'

	private void helper(char[] cur, int left, int right, int index, List<String> result) {
		// TODO Auto-generated method stub
		//when we dont have any parentheses left
		if (left==0 && right ==0) {
			result.add(new String(cur));
			return;
		
		}
		//when we can add a '(' whenever there is some '(' we can still use
		if (left>0) {
			cur[index]='(';
			helper(cur,left-1,right,index+1,result);
		}
		if(right>left) {
			cur[index]=')';
			helper(cur,left,right-1,index+1,result);
		}
		
	}
}
