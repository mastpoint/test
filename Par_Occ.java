import java.util.*;
class Par_Occ
{
	public static void main(String...  s)
	{
	int a[];
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements");
	int n=sc.nextInt();
	a=new int[n];
	Par_Occ po=new Par_Occ();
	System.out.println("enter the array elements");
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	System.out.println("enter the value of key you want to count");
	int key=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		
		if(a[i]==key)
		{	count++;
		System.out.println("exist at position:" +i);}
	}
	if(count==0)
		
		{System.out.println(key +"doesnot exist in arry");}
	else
		System.out.println("result found:" +count);
}
}