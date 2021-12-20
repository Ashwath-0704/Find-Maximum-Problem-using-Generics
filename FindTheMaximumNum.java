package CompareTo;

import java.util.*;

public class FindTheMaximumNum  {

	static Scanner sc = new Scanner(System.in);

	/*
	 * UC1 Given 3 Interger find the maximum
	 */
	public void maxmumIntegerNum(Integer A, Integer B, Integer C) {
		Integer max = A;
		if (B.compareTo(max) > 0) {
			max = B;
		}
		if (C.compareTo(max) > 0) {
			max = C;
		}
		System.out.println("The maximum Integer value is : " + max);
	}

	/*
	 * UC2 Given 3 Float find the maximum
	 */
	public void maxmumFloatNum(Float A, Float B, Float C) {
		Float max = A;
		if (B.compareTo(max) > 0) {
			max = B;
		}
		if (C.compareTo(max) > 0) {
			max = C;
		}
		System.out.println("The maximum Float value is : " + max);
	}

	/*
	 * UC3 Given 3 Strings find the maximum
	 */
	public void maxmumStringNum(String A, String B, String C) {
		String max = A;
		if (B.compareTo(max) > 0) {
			max = B;
		}
		if (C.compareTo(max) > 0) {
			max = C;
		}
		System.out.println("The maximum String value is : " + max);

	}
	public static void main(String[] args) {
		FindTheMaximumNum g = new FindTheMaximumNum();
		
//		g.maxmumIntegerNum(20, 5, 30);// UC1
//		g.maxmumFloatNum(50.0f, 20.0f, 30.0f);// UC2
		g.maxmumStringNum("pear", "apple", "orange");// UC3
	}

}
