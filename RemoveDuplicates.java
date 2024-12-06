package DemoPrgms;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 2, 2, 12, 13, 34, 5, 7, 67, 8, 34, 25, 89, 32, 3, 98, 7 };

//		String b = Arrays.toString(Arrays.stream(a).distinct().toArray());
//
//		System.out.println(b);

		Set<Integer> s = new TreeSet<>();
		for (int i : a) {
			s.add(i);
		}

		System.out.println(s);
	}

}
