package StringProgram;

public class RevereseEachWord {

	public static void main(String[] args) {
		String str= "This is Rohit";
		String str1[]= str.split(" ");
		
		for(int i=0;i<str1.length;i++) {
			
			char c[]=str1[i].toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				System.out.print(c[j]);
			}
			System.out.print(" ");
		}
		

	}

}
