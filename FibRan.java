import java.util.*;
class FibRan
{
	public static void main(String... s)
	{
		FibRan fr=new FibRan();
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		int a[];
		System.out.println("enter the number of array elements");
		int n=sc.nextInt();
		a=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
			System.out.println(a[i]+random.nextInt()%200);
		a[0]=0;
		a[1]=1;
		
		for(int i=2;i<n;i++)
			a[i]=a[i-1]+a[i-2];
		for(int i=0;i<n;i++)
		System.out.println(a[i]);
		
	}
}