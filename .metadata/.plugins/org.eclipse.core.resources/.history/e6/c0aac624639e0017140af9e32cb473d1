package round2;
//use dp much better than K times call stack;
public class Fibonacci {
	public long fibonacci(int K){
		if (K<=0) {
			return 0;
		}
		long[] array = new long[K+1];
		array[1]=1;
		for (int i=2; i<=K;i++) {
			array[i]=array[i-2]+array[i-1];
		}
		return array[K];
	}
}
