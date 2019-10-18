import java.util.*;
class Shift
{
	public static void main(String... t)
	{
		int a[];
		int temp;
		
			Scanner s=new Scanner(System.in);
			System.out.println("enter the length of array");
			int l=s.nextInt();
			a=new int[l];
			System.out.println("enter the array elements:");
			for(int i=0;i<a.length;i++)
				a[i]=s.nextInt();
			//temp=a[l-1];
			//for(int i=l-1;i>0;i--)
			//{a[i]=a[i-1];}
		//a[0]=temp;
		
		
		
		//left shift
		temp=a[0];
		for(int i=0;i<l-1;i++)
		{a[i]=a[i+1];}
	a[l-1]=temp;
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
