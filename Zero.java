import java.util.Scanner;
class Zero
{
	public static void main(String... s)
	{
		int a[][];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows and column");
		int r=sc.nextInt();
		int c=sc.nextInt();
		a=new int[r][c];
		System.out.println("enter the array elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		}
		
		for(int i=0;i<r;i++)
		{for(int j=0;j<c;j++)
			a[i][j]=0;}
		
		for(int i=0;i<r;i++)
		{for(int j=0;j<c;j++)
			//System.out.println("zero array is:" );
		System.out.println(a[i][j]);}
	}
}