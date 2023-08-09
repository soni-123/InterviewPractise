package StringProgram;

public class StringNumberReverse {

	public static void main(String[] args) {
		//String str2="";
		//String str=revNum("This is 654 number and count should be reverse 98765 number");
		//System.out.println(str);

		checkAscii();



	}

	public static String revNum(String s)
	{
		String str1[]=s.split(" ");
		String str2="";
		int ascii;
		for(int i=0;i<str1.length;i++)
		{
			ascii=str1[i].charAt(0);
			System.out.println(ascii);
			if(ascii>=48 && ascii<=57)
			{
				str2=str2+rev(str1[i])+" ";
			}
			else {
				str2=str2+str1[i]+" ";
			}
		}

		return str2;

	}
	public static String rev(String s) {
		String str2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			str2=str2+s.charAt(i);
		}
		return str2;
	}
	
	public static void checkAscii()
	{
		String str="This is 45 Rohit ";
		String str1[]=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			int ascii=str1[i].charAt(0);
			if(ascii>=48 && ascii<=57)
			System.out.print(rev(str1[i])+" ");
			else
			System.out.print(str1[i]+ " ");
		}
	}

}
