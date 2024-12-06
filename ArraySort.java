package DemoPrgms;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {12,4,1,22,45,33};
		Arrays.sort(a);
		for(int i : a)
		{
			System.out.println(i);
		}
		
		
//		List<Integer> a = Arrays.asList(12,4,1,22,45,33);
//		a.stream().sorted().forEach(i -> System.out.println(i));
	}

}
