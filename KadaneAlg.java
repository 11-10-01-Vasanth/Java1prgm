package DemoPrgms;

public class KadaneAlg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -1, -2, -3, -4, -5, 1, 2, 3 };
		int maxvalue = Integer.MIN_VALUE;
		int currentSum = 0;
		for (int i : a) {
			currentSum = Math.max(i, currentSum + i);
			maxvalue = Math.max(maxvalue, currentSum);
		}

		System.out.println(maxvalue);

	}

}
