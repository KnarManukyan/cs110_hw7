import animal.Puppy;
import utils.*;

public class Driver{
    public static double d = 15.25;
    public static int i = (int) d; 
    public static void main(String[] args) {
	    Puppy a = new Puppy("Joey");
	    Puppy b = new Puppy("Chandler");
	    Puppy c = new Puppy("Ross");
	    System.out.println(a.getName());
	    System.out.println(b.getName());
	    System.out.println(c.getName());
	    int [] arr= {9, 20, 3, 44, 88, 300};
	    int [] reverse = ArrayUtils.reverse(arr);
	    System.out.println(ArrayUtils.stringifyArray(reverse));
	    System.out.println(math.factorialLoop(i));
    }
}