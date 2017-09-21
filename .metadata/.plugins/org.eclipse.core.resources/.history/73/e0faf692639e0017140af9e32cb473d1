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