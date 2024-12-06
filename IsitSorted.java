package DemoPrgms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class IsitSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,6,4,5};
		int b[] = Arrays.stream(a).sorted().toArray();
		boolean isSort = true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] != b[i])
			{
				isSort = false;
				break;
			}
		}
		System.out.println(isSort);
		
		
	}

}
