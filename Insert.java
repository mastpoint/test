import java.util.*;
class Insert
{//Error
	public static void main(String... s)
	{
	int a[],b[];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements");
	int n=sc.nextInt();
	Insert in=new Insert();
	a=new int[n];
	b=new int[n+1];
	System.out.println("enter the array elements");
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	/*System.out.println("enter the position to insert");
	int pos=sc.nextInt();
	for(int i=0;i<pos;i++)
		a[i]=a[i+1];
	System.out.println("enter the element to insert");
	a[pos-1]=sc.nextInt();*/
	
	// insert element at 1st.
	/*System.out.println("enter the element to insert");
	a[0]=sc.nextInt();*/
	
	//insert element at last index.
	System.out.println("enter the element to insert");
	a[n-1]=sc.nextInt();
	n++;
	for(int i=0;i<n+1;i++)
	{
		for(int j=0;j<n+1;j++)
	{ b[i]=a[j]+a[n-1];}
	}
	
	System.out.println("updated array is:");
	for(int i=0;i<n+1;i++)
		System.out.println(b[i]);
}
}