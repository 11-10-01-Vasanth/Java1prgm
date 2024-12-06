package DemoPrgms;

import java.util.*;
import java.util.stream.Collectors;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = { 1, 2, 3, 4, 5 };
		Integer b[] = { 4, 5, 6, 7, 8 };

		Object[] l = Arrays.asList(a).stream()
									.filter(Arrays.asList(b)::contains)
									.toArray();
		System.out.println(Arrays.toString(l));

//		Integer a[] = { 1, 2, 3, 4, 5 };
//		Integer b[] = { 4, 5, 6, 7, 8 };
//
//		List<Integer> l = Arrays.asList(a)
//								.stream()
//								.filter(Arrays.asList(b)::contains)
//								.collect(Collectors.toList());
//		System.out.println(l);

//		int a[] = { 1, 2, 3, 4, 5 };
//		int b[] = { 4, 5, 6, 7, 8 };

//		Set<Integer> s = new HashSet<>();
//		for (int i : a) {
//			s.add(i);
//		}
//
//		for (int i : b) {
//			if (s.contains(i)) {
//				System.out.println(i);
//			}
//		}
	}

}
