import java.util.*;
public class Del_Negative
{//ERROR
public static void main(String... s)
{
int a[];
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements ");
	int n=sc.nextInt();
	a=new int[n];
	Del_Negative dn=new Del_Negative();
	System.out.println("enter the array elements");
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		if(a[i]<0)
			a[i]=a[i+1];
		//count++;
	}count++;
	System.out.println("updated array elements");
	for(int i=0;i<n-count;i++)
		System.out.println(a[i]);
}
}