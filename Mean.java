import java.util.Scanner;
class Means
{
	public static void main(String... s)
	{
		
		int a[];
		int sum=0;
		double mean;
		int median;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=sc.nextInt();
		a=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		mean=sum/n;
		System.out.println("mean is"+mean);
		
		
		for(int i=0;i<n;i++)
			()
		
		
		
	}
}