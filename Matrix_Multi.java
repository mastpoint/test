import java.util.Scanner;
class Matrix_Multi
{
	public static void main(String... t)
	{
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of rows and column of array a annd b");
		
		int r=s.nextInt();
		int c=s.nextInt();
        int a[][]=new int[r][c];	
	    int b[][]=new int[r][c];
		int d[][]=new int[r][c];
		
	System.out.println("enter the array elements of a");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{a[i][j]=s.nextInt();}
		}
		System.out.println("enter the array elements of b");
		for(int i=0;i<b.length;i++)
		{for( int j=0;j<b.length;j++)
			{b[i][j]=s.nextInt();}
	
	}
	
			
			
     for(int i=0;i<r;i++)
	 {
		 for(int j=0;j<c;j++)
		 {
			 for(int k=0;k<r;k++)
	 {
		d[i][j]= d[i][j]+a[i][k]*b[k][j];
     }}}
 
 
     for(int i=0;i<r;i++)
 {
	 for(int j=0;j<c;j++)
 {
	 System.out.println(d[i][j]);
	 }
	 }
	}	
	}