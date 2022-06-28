package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class HourGlass {

	public static int[][] twoDArr;
	public static ArrayList<Integer> sumArr;

	public static void main(String[] args) throws Exception {
		sumHourGlasses(createTwoDArr());
	}

	public static int[][] createTwoDArr() throws Exception {
		try {
			Random rand = new Random();
			twoDArr = new int[6][6];
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					twoDArr[i][j] = rand.nextInt(50);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
		return twoDArr;
	}

	public static ArrayList<Integer> sumHourGlasses(int[][] matrix) throws Exception {
		try {
			sumArr = new ArrayList<Integer>();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					int a = matrix[i][j];
					int b = matrix[i][j + 1];
					int c = matrix[i][j + 2];
					int d = matrix[i + 1][j + 1];
					int e = matrix[i + 2][j];
					int f = matrix[i + 2][j + 1];
					int g = matrix[i + 2][j + 2];
					Integer h = new Integer(a + b + c + d + e + f + g);
					sumArr.add(h);
				}
			}
			System.out.println(sumArr.toString());
			System.out.println(Collections.max(sumArr));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
		return sumArr;
	}

}
