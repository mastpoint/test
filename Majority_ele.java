import java.util.Scanner;
class Majority_Ele
{
	public static void main(String... s)
	{
		int a[]; int temp=0,tempcount=0;
		int majoritycount;
		int majority=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		a=new int[n];
		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	for(int i=0;i<n;i++)
	{temp=a[i];
tempcount=0;
		for(int j=1;j<n;j++)
		{if(temp==a[j]);
	tempcount++;
	}}
	majoritycount=n/2;
	
	if(tempcount>majoritycount)
	{majority=temp;
	System.out.println(+majority);}
	}
}