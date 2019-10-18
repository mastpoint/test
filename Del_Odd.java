import java.util.*;
public class Del_Odd
{//ERROR
	public static void main(String... s)
	{
		int a[];
		int count=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		a=new int[n];
		Del_Odd  od=new Del_Odd();
		System.out.println("enter teh array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		
			if(a[i]%2==0)
			{count++;
	
			}
		else
		a[i]=a[i+1];
	c++;}
	for(int j=0;j<n;j++)
		System.out.println(a[j]);
	}
}