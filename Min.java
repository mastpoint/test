import java.util.*;
class Min
{
	public static void main(String... s)
	{
	int a[][];
	int max,min;
	System.out.println("enter the number oof rows in array a");
	int r=new Scanner(System.in).nextInt();
	System.out.println("enter the number of column in array");
	int c=new Scanner(System.in).nextInt();
	a=new int[r][c];
	System.out.println("enter the array elements");
	for(int i=0;i<a.length;i++)
	{for(int j=0;j<a.length;j++)
	{a[i][j]=new Scanner(System.in).nextInt();
	}}
 max=a[0][0];
 min=a[0][0];
for(int i=1;i<a.length;i++)
{for(int j=1;j<a.length;j++)
if(a[i][j]<min)
{min=a[i][j];}

System.out.println("maximum is" +min);
}
}
}