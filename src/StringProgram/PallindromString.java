package StringProgram;

public class PallindromString {

	public static void main(String[] args) {
	String str="ABCBA";
	String str1="";
	char ch[]=str.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		str1=str1+ch[i];
	
	}
	System.out.println(str1);
	
	if(str.equals(str1))
	{
		System.out.println("String is pallindrom");
	}
	else {
		System.out.println("String is not pallindrom");
	}

	}

}
