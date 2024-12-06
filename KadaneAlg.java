package DemoPrgms;

import java.util.Arrays;

public class KadaneAlg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1,2,-4,-5,3,1,-8};
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;

		for (int num : a) {
		    currentSum = Math.max(num, currentSum + num);
		    maxSum = Math.max(maxSum, currentSum);
		}
		System.out.println(maxSum);

	}

}
