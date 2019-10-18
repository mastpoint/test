import java.util.Scanner;
class NonRepeat
{
	public static void  main(String... s)
	{
		int a[];
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=sc.nextInt();
		a=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{if(a[i]!=a[j])
				{
			temp=a[i];
				}
		}}
	System.out.println(+temp);
	}
}