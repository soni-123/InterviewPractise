package StringProgram;

public class FindCapitalAndSmallLetter {

	public static void main(String[] args) {
		
		String str="Automation Is Future";
		
		String str1[]=str.split(" ");
		
		for(int i=0;i<str1.length;i++)
		{
			char ch[]=str1[i].toCharArray();
			for(int j=0;j<ch.length;j++) {
				if(ch[j]>=65 && ch[j]<=91)
				{
					System.out.print(ch[j]);
				}
		
				
			}
			}

	}

}
