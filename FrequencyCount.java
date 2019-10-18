import java.util.Scanner;
class FrequencyCount//wrong
{
	public static void main(String... s)
	{
		int a[][];
		int count=1;
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
			{for(int k=i+1;k<r;k++)
				{for(int j=0;j<c;j++)
	{//count =1;
		for(int l=j+1;l<c;l++)
		{
			if(a[i][j]==a[k][l])
			{count ++;
	System.out.println(a[i][j]+" "+count);}
		}
	}}}
}}