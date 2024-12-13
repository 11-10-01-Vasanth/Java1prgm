package DemoPrgms;

import java.util.Arrays;

public class SortZerosones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1 };
		
		int zerocount = 0;
		for(int i:a)
		{
			if(i==0)
			{
				zerocount++;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = (i<zerocount) ? 0 : 1;
		}
		
		System.out.println(Arrays.toString(a));
		
		String b = Arrays.toString(Arrays.stream(a).filter(i -> i==0).toArray());
		System.out.println(b);
	}

}
