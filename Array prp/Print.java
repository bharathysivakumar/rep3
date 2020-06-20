package sampl;
import java.util.*;
public class Print {
	public static void main(String[] args) {
		int[] h = {5, 4, 3, 9, 1, 7, 9};
		int n ;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int index = -1;

		for (int i = 0; i < h.length; i++) {
			if (h[i] == n) {
				index = i + 1;
				break;
			}
		}

		System.out.println(index);
	}
}
