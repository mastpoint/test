import java.util.*;
class Max
{
public static void main(String... s)
{
	int a[]={78,35,40,50,80,27,38,47,55};
	int i;
	//a=new int[length];
	System.out.println("the array elements are");
	for( i=0;i<a.length;i++)
	{System.out.println(a[i]);}
	
	int max=a[0];
	int min=a[0];
	for(i=1;i<a.length;i++)
	{if(a[i]<min)
	{min=a[i];}}
	System.out.println(+min);	
	
}}