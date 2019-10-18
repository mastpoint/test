import java.util.*;
class Delete_Particular
{
	public static void main(String... s)
	{
		int a[];
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		Delete_Particular dp=new Delete_Particular();
		a=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter the element to be deleted:");
		int ele=sc.nextInt();
		for(int j=0;j<n;j++)
		{if(a[j]==ele)
			{for(int i=j;i<n-1;i++)
		a[i]=a[i+1];}}
		System.out.println("updated array is:");
		for(int i=0;i<n-1;i++)
			System.out.println(a[i]);
	}
}