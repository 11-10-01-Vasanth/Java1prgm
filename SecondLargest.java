package DemoPrgms;

import java.util.Arrays;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,2,2,12,13,34,5,7,67,8,34,25,89,32,3,98,7};
		
		//distinct -- Remove duplicates
		int b[] = Arrays.stream(a).sorted().distinct().toArray();
		
		System.out.println(b[b.length-2]);
		
		
		
		
//		TreeSet<Integer> s = new TreeSet<>();
//		for(int i:a)
//		{
//			s.add(i);
//		}
//		
//		s.pollLast();
//		s.last();
	}

}
