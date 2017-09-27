//
//Given a integer dictionary A of unknown size, 
//where the numbers in the dictionary are sorted in ascending order, determine
//if a given target integer T is in the dictionary. Return the index of T in A, return -1 if T is not in A.
//
//Assumptions
//
//dictionary A is not null
//dictionary.get(i) will return null(Java)/INT_MIN(C++) if index i is out of bounds
//Examples
//
//A = {1, 2, 5, 9, ......}, T = 5, return 2
//A = {1, 2, 5, 9, 12, ......}, T = 7, return -1
package round2;

import java.util.Dictionary;

//You can use it directly, the implementation is provided when testing your solution.
public class SearchInUnknowSize {
	public int search(Dictionary dict, int target) {
	 // Write your solution here
	  if (dict == null){
	    return -1;
	  }
	  int left = 0;
	  int right = 1;
	  while (dict.get(right)!=null && (int)dict.get(right) < target){
	    right *=2;
	  }
	  while (left <= right) {
	    int mid = left + ( right - left)/2;
	    Integer x =  (int)dict.get(mid);
	    if (x==null || target <x) {// 不能 调换位置  不然 不然就是 不然就是null  point   exception
	      right = mid -1;
	    }else if (target == x){
	      return mid;
	    }else {
	      left = mid +1;
	    }
	  }
	  return -1;
	}
	}