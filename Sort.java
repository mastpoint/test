import  java.util.*;
class Sort
{
	public static void main(String... s)
	{
		int a[][];
		int temp=0;
		System.out.println("enter the number of rows");
		int r=new Scanner(System.in).nextInt();
		System.out.println("enter the number of coloumn");
		int c=new Scanner(System.in).nextInt();
		a=new int[r][c];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
				a[i][j]=new Scanner(System.in).nextInt();
		}
		System.out.println("array elements are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{System.out.println(a[i][j]+" ");}
	System.out.println("\n");}
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				{
				if(a[i][j]>a[i+1][j+1])
				{
					temp=a[i][j];
					a[i][j]=a[i+1][j+1];
					a[i+1][j+1]=temp;
				}
			}
		}}
		System.out.println("sorted array is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++){
		System.out.println(a[i][j]);}
		}
	}
}