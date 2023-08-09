package StringProgram;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		int count=0;
		String str="Selenium new version 4.11 which support chrome version 115";
		//String str1=str.replaceAll(" ", "@");// using replace all method we can do that 
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isWhitespace(ch[i])) //Either we have whitespace function to get count
			{
				count++;
			}
		}
		
		System.out.println("White space count= "+count);
	}

}
