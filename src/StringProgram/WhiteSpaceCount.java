package StringProgram;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		int count=0;
		String str="Selenium new version 4.11 which support chrome version 115";
		String str1=str.replaceAll(" ", "@");
		char ch[]=str1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='@')
			{
				count++;
			}
		}
		
		System.out.println("White space count= "+count);
	}

}
