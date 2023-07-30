package StringProgram;

public class CountOfDigitInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="123Rohit123";
		char ch[]=str.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				sum=sum+Character.getNumericValue(ch[i]);
				
			}
		}
		System.out.println(sum);

	}

}
