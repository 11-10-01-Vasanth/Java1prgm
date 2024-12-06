package DemoPrgms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int[] b = {3,4,5,6,7};
		
		
		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
		System.out.println(Arrays.toString(c));
		
//		for(int i : c)
//		{
//			System.out.println(i);
//		}
	}

}
