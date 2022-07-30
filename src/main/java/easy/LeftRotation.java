package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftRotation {

	public static int n = 2;
	public static ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));;
	public static ArrayList<Integer> arr2 = new ArrayList<Integer>();

	public static void main(String[] args) {
		System.out.println(arr.toString());
		for (int i = n; i < arr.size(); i++) {
			arr2.add(arr.get(i));
		}
		for (int i = 0; i < n; i++) {
			arr2.add(arr.get(i));
		}
		System.out.println(arr2.toString());
	}

}
