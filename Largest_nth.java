import java.util.*;
class Largest_nth
{
	public static void main(String... s)
	{
		int a[];
		int temp1;
		int temp2=-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of array elements");
		int n=sc.nextInt();
		a=new int[n];
		Largest_nth l=new Largest_nth();
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter the largest number you want to find");
		int num=sc.nextInt();
		 temp1=a[0];
		for(int i=1;i<n;i++)
		{if(temp1<a[i])
		temp1=a[i];	
		}
			for(int i=2;i<num;i++)
			{ temp2=-1;
			for(int j=0;j<n;j++)
			{
				if(temp2<a[j]  &&   a[j]<temp1)
					temp2=a[j];
			}}
			if(temp2!=-1)
				temp1=temp2;
			System.out.println("largest num is:"  +temp1);
	}
}