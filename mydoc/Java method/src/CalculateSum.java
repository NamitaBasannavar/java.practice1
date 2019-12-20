import java.util.Scanner;
public class CalculateSum {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		
		int sum;
		double avg;
		System.out.println("enter the number");
		sum = sc.nextInt();
		int arr[]=new int[sum];
		int total=0;
		for( int i=0; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
			total=total+arr[i];
			
		}
		System.out.println("" +total);
		avg = total/sum;
		System.out.println("" +avg);
		
	}

}
