import java.util.*;
class Par_Occ_Ele
{
public static void main(String... s)
{
	int a[];
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements");
	int n=sc.nextInt();
	a=new int[n];
	Par_Occ_Ele po=new Par_Occ_Ele();
	System.out.println("enter the array elements");
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	for(int i=0;i<n-1;i++)
	{
		for(int j=i;j<n;j++)
		{
			if(a[i]==a[j])
				count++;
		}
	}
	for(int i=0;i<n;i++)
	//System.out.println(a[i]);
System.out.print(a[i]"exist times in array"count);
}
}