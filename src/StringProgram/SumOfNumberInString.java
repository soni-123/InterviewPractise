package StringProgram;

public class SumOfNumberInString {

	public static void main(String[] args) {
		String str="Selenium56Java87Automation98";
		String tempNum="0";
		int sum=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				tempNum+=ch[i];
			}
			else {
				sum+=Integer.parseInt(tempNum);
				tempNum="0";
			}
			
		}
		sum+=Integer.parseInt(tempNum);
		System.out.print("Total sum of digit= "+sum);
	}

}
