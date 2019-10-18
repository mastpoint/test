class Dec_Bin
{
	public static  void main(String...  s)
	{
		int x=65;
		int i=0;
		int a[]=new int[32];
		/*while(x!=0)
		{
			a[i]=x%2;
			x=x/2;
			i++;
		}*/
		
		//octal to binary
		/*while(x!=0)
		{
			a[i]=x%8;
			x=x/8;
			i++;
		}*/
		
		
		// hexadec. to binary
		while(x!=0)
		{
			a[i]=x%16;
			x=x/16;
			i++;
		}
		for(i=i-1;i>=0;i--)
			System.out.println(a[i]);
	}
}