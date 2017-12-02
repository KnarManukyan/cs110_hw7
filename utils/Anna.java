package utils;
public class Anna{
public static int[] reverse(int[] arr) {
		int a = arr.length;
		int[] arr2 = new int[a];
		for(int j= a-1,i = 0; i<a; i++, j--) {
			arr2[i] = arr[j]; 
		}
		return(arr2);
	}
	
	
public static void main(String[] args) {
    int [] arr= {9, 20, 3, 44, 88, 300};
    int [] reverse = ArrayUtils.reverse(arr);
  }
}
