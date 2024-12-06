package DemoPrgms;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 4, 5, 6 };
		int n = a.length + 1;
		int total = n * (n + 1) / 2;
		int arrsum = Arrays.stream(a).sum();

		System.out.println(total + " " + arrsum + " " + (total - arrsum));
	}

}
