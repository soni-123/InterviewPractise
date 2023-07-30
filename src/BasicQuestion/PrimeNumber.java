package BasicQuestion;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a=2,b=100,count=0;
		
		for(int i=a;i<b;i++)
		{
			count=0;
			for(int j=i+1;j<b;j++)
			{
				if(i%j==0)
					
				{
					count=1;
				}
			}
			if(count==1)
			{
				System.out.print(i);
			}
		}
		
		
	}

}
