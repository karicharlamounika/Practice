package demo1;

public class EvenOdd 
{
	public static void main(String args[])
	{
		int a[]= {1,8,3,5,6,9,10,20,21,22,25};
		for(int i =0;i<=a.length-1;i++)
		{
			
			if(a[i]%2==0)
				
			{
				System.out.println("Even Numbers are :" );
				System.out.println(a[i]);
			}
			
			else
				
			{
				System.out.println("Odd NUmbers are:");
				System.out.println(a[i]);
			}
		}
	}

}
