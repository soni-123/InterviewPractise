package BasicQuestion;
public class PrimeNumber{
	public static void main(String[] args) {
		int a=2,b=100,flag;		
		System.out.println("Prime No");
		for(int i=a;i<b;i++)
		{
			flag=1;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)	
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println(i);
			}
		}
	}
}
