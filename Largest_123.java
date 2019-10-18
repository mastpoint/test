import java.util.*;
class Largest_123
{
	public static void main(String... s)
	{
		int a[];
		int first=0,sec=0,third=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n=sc.nextInt();
		a=new int[n];
		Largest_123 l=new Largest_123();
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]>first)
				first=a[i];
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>sec  && a[i]<first)
				sec=a[i];
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>third   &&  a[i]<sec)
				third=a[i];
		}
		System.out.println("first largest is:" +first);
		System.out.println("second largest is:" +sec);
		System.out.println("third largest is:" +third);
	}
}