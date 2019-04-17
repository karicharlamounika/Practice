package demo1;

public class AddDigits {

	public static void main(String[] args) 
	{
		int m[] = {1245,1556,1367,146767,15676,8967,7967,9967};
		int  n, sum = 0;
		for(int i=0;i<=m.length-1;i++)
		{
		sum=0;
        while(m[i] > 0)
        {
            n = m[i] % 10;
            sum = sum + n;
            m[i] = m[i]/ 10;
            
        } 
        System.out.println(sum);
  
		}
	}

}
