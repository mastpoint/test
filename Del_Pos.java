import java.util.*;
class Del_Pos
{
	public static void main(String... s)
	{
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of array elements");
		int n=sc.nextInt();
		Del_Pos dp=new Del_Pos();
		a =new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter the postion to delete");
		int pos=sc.nextInt();
		for(int i=pos;i<n-1;i++)
			a[i]=a[i+1];
		System.out.println("updated array is:");
		for(int i=0;i<n-1;i++)
			System.out.println(a[i]);
	}
}