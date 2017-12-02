package utils;

public class ArrayUtils {
	public static int [] reverse(int[] arr) {
		int num = arr.length;
		int [] newarr = new int[num];
		for(int i=arr.length-1, j=0; i>=0; i--, j++) {
			newarr[j] = arr[i];
		}
		return (newarr);
	}
	public static String stringifyArray(int[] arr) {
	    String line = Integer.toString(arr[0]);
	    for(int i=1; i<arr.length; i++) {
	    	line = line +","+arr[i]; 
	    } 
	    return(line);
	}
}