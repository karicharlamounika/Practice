package demo1;

public class PrimeNumbers {

	public static void main(String[] args) 
	{
		int a[] = {15,13,67,65,45,2};
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			boolean flag = false;
			for(int j = 2; j <= a[i]/2; ++j)
	        {
	            // condition for nonprime number
	            if(a[i] % j == 0)
	            {
	                flag = true;
	                break;
	            }
	        }

	        if (!flag)
	            System.out.println(a[i] + " is a prime number.");
	        else
	            System.out.println(a[i] + " is not a prime number.");
		
		}

	}

}
