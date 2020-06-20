package sampl;

public class Demo1 {
	public static void main(String[] args) {
		int[] array = {7,1,2,3,6};
		int sum = 0;
		int s = -1;
		int s1 = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 6) s = i;
			if (array[i] == 7) s1= i;
		}

		if (s1 == -1) s= -1;

		for (int i = 0; i < array.length; i++) {
			if (s!= -1 && i >= s&& i <= s1) continue;
			sum += array[i];
		}

		System.out.println(sum);
}
}