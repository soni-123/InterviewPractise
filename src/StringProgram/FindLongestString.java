package StringProgram;

public class FindLongestString {

	public static void main(String[] args) {
		
		String str="India is my country";
		String str1[]=str.split(" ");
		int length=0;
		String str2="";
		for(int i=0;i<str1.length;i++)
		{
			char ch[]=str1[i].toCharArray();
			int len=ch.length;
			if(length<len) {
				length=len;
				str2=str1[i];
			}
			
		}
		System.out.println("Biggest word in string is:-  "+str2);

	}

}
