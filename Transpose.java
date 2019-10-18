import java.util.Scanner;

class Transpose
{
public static void main(String... t)
{
int a[][],b[][];
int i,j;
Scanner s=new Scanner(System.in);
System.out.println("enter the number oof rows and column in array");
int r=s.nextInt();
int c=s.nextInt();
a=new int[r][c];
b=new int[r][c];
System.out.println("Enter the array elements:");
for( i=0;i<a.length;i++)
{for( j=0;j<a.length;j++)
a[i][j]=s.nextInt();}
System.out.println("transpose matrix is:");
for( i=0;i<a.length;i++)
{for( j=0;j<a.length;j++)
b[i][j]=a[j][i];}
for( i=0;i<b.length;i++)
{for( j=0;j<b.length;j++)
System.out.println(b[i][j]);}
}
}