import java.util.Scanner;
class Smallest
{
public static void main(String... s)
{
	int a[];
	int small1,small2;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements");
	int l=sc.nextInt();
	a=new int[l];
	System.out.println("enter the array elements");
	for(int i=0;i<l;i++)
		a[i]=sc.nextInt();
	System.out.println("enter the number you want to small:");
	int n=sc.nextInt();
	small1=a[0];
	for(int i=1;i<l;i++)
			{if(small1>a[i])
			small1=a[i];}
		
		small2=a[1];
		for(int k=1;k<n;k++)
		{
			for(int j=1;j<l;j++)
			{if(small2>a[j] && a[j]>small1)
				small2=a[j];}
		}
			
	
	System.out.println("smallest is"+small1);
	System.out.println("smallest nth is" +small2);
}
}