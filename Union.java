import java.util.*;
class Union //wrong
{
	public static void main(String... s)
	{
		int a[][],b[][];
		//int union,inter;
		System.out.println("enter the number of  rows in array a and b");
		int r=new Scanner(System.in).nextInt();
		System.out.println("enter the number of column in array a and b");
		int  c=new Scanner(System.in).nextInt();
		a=new int[r][c];
		b=new int[r][c];
		System.out.println("enter the array elements of a");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{a[i][j]=new Scanner(System.in).nextInt();}
		}
		System.out.println("enter the array element of b");
		for(int ii=0;ii<b.length;ii++)
		{
			for(int jj=0;jj<b.length;jj++)
			{b[ii][jj]=new Scanner(System.in).nextInt();}
		}
		for(int i=0;i<a.length;i++ )
		{for(int ii=0;ii<b.length;ii++)
		{
			for(int j=0;j<a.length;j++)
			{for(int jj=0;jj<b.length;jj++)
			{if(a[i][j]>b[ii][jj])
			{System.out.print(a[i][j]);
			System.out.println();}
			else
			if(b[ii][jj]>a[i][j])
			System.out.print(b[ii][jj]);}}
			}}
	}
}