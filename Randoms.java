import java.util.*;
class Randoms
{
	public static void main(String... s)
	{
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of array elements");
		int n=sc.nextInt();
		a=new int[n];
		Random  r=new Random();
		Randoms rs=new Randoms();
		System.out.println("the array elements are:");
		for(int i=0;i<n;i++)
		System.out.println(a[i]+r.nextInt()%100);
		
	}
}
/* OUTPUT:
enter the number of array elements
7
 the array elements are
66
-70
-70
-68
-68
-49
47
*/