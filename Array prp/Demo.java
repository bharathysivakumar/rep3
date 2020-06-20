package sampl;

public class Demo {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50};
		int sum=0;int avg=0;
		for(int i=0;i<5;i++) {
			sum=sum+arr[i];
			avg=sum/5;
		}

		System.out.println("sum of array is:"+sum);
		System.out.println("avg of array is:"+avg);
	}

}
