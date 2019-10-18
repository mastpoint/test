import java.util.*;
class Intersection
{
public static void main(String... s)
{
     int a[]={1,3,2,5,4,6,7,9,};
	 int b[]={23,45,5,4,91,19};
	 int temp=0;
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<b.length;j++)
		 {
			 if(a[i]==b[j])
			 System.out.println(a[i]);
		 }
	 }
	 
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<b.length;j++)
		 {
			 System.out.print(a[i]);
			 {if(a[i] < b[j])
			 System.out.print(b[j]);
		 else
			 System.out.print(b[j]);}
		 
			 
			// System.out.print(b[j]);}
		 }
	 }
 
}
}