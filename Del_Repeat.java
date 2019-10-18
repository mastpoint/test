import java.util.*;
class Del_Repeat
{
	public static void main(String... s)
	{
		int a[];
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		a=new int[n];
		Del_Repeat dr=new Del_Repeat();
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{if(a[i]==a[j])
			{for(int k=j;k<n-1;k++)
			a[k]=a[k+1];
		count++;}
	}}
	System.out.println("updated array is:");
	for(int i=0;i<n-count;i++)
		System.out.println(a[i]);
		
	}
}