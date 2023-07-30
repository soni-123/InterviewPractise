package BasicQuestion;

public class PrintPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(2*j+" ");
			}
			System.out.print("\n");
		}

	}

}
