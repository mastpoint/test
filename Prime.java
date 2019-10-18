import java.util.*;
class Prime
{
	public static void main(String... s)
	{
		int a[];
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		a=new int[n];
		Prime p=new Prime();
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
	
		for(int i=0;i<n;i++)
		{
			int flag=0;
		for(int j=2;j<a[i]/2;j++)
		{if(a[i]%j==0)
			{flag=1;
		System.out.println("number is composite");
		
		break;}}
			if(flag==0   && a[i]>2)
			{c++;
				System.out.println("number is prime" +c);
	}}
	
	System.out.println("total prime numbers are:" +c);
	}
}