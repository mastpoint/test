class Bin_Dec
{
	public static void main(String... s)
	{
	int num=1000001;
	 //int num=101;
	 //int num=41;
      int rem=0;
      int count=0;
      int sum=0;
    	while(num!=0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem*(int)Math.pow(2,count);
			//sum=sum+rem*(int)Math.pow(8,count);
			//sum=sum+rem*(int)Math.pow(16,count);
			count++;
		}
		System.out.println(sum);
}
}