package challenges;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDS {
	
	static int[] a = new int[] {5,4,3,2,1};
	static int[] b = new int[a.length];
	static int count = 0;
	
	public static void main(String[] args) {
		
		for (int i = a.length - 1; i > -1; i--) {
			b[count] = (int)Array.get(a,  i);
			count++;
		}
		
		System.out.println(Arrays.toString(b));
		
	}

}
