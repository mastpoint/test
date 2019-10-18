import java.util.Scanner;
class Conse_seq
{
	public static void main(String... s)
	{
	int a[];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements:");
	int n=sc.nextInt();
	a=new int[n];
	System.out.println("enter the array elements:");
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
for(int i=0;i<n-1;i++)
{
	if(a[i]-a[i+1]==-1)
		System.out.println(a[i]);
}
if(a[n-1]-a[n]==-1)
{System.out.println(a[n]);}
}
}