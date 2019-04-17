package demo1;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int m[] = {1245,371,1367,146767,15676,8967,7967,9967};
	
		int  n, temp;
		int sum=0;
		for(int i=0;i<=m.length-1;i++)
		{
		sum=0;
		temp =m[i];
        while(m[i] > 0)
        {
        	
            n = m[i] % 10;
            sum = sum + (n*n*n);
            m[i] = m[i]/ 10;
            
        } 
        System.out.println(sum);
        if(sum==temp)
        {
        	System.out.println("number is armstrong");
        }
        else
        {
        	System.out.println("number is not armstrong");
        }
  
		}
	}

}
