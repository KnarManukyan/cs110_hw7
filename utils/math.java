package utils;

public class math{
	public static long factorial(int num) {
	long result = 1;
	if (num == 0) {
		return 1;
	}
	result =num *factorial( num-1);
	return(result);
	}
	public static long factorialLoop(int num) {
		long total = 1;
		for(int i=0; i < num; i++) {
			total = total * (num-i);
		}
	return total;
	}
}