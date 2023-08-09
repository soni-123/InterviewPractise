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
		String str1 = "Selenium45Automation78Java56" ;// "nap20jk10ui10"; // Selenium45Automation78Java56

		System.out.print("Sum: ");
		System.out.println(findSum(str1));
		//getNumeric();

	}

	 public static int findSum(String str) {

		    //Create a String tempSum
		    String tempSum = "0";
		    int sum = 0;

		    //Loop throught the string 
		    for (int i = 0; i < str.length(); i++) {
		      char s = str.charAt(i); //convert each string into character

		      if (Character.isDigit(s)) //check if the character is an is an Digit using java inbuilt Character class and isDigit method
		        tempSum += s; //If it is an digit then store in tempSum String

		      else {
		        sum += Integer.parseInt(tempSum);  //Convert the tempSum string to Integer
		        tempSum = "0";// Once the substring in tempSum is formed add the sum then set tempSum =0 for taking next count
		      }
		    }

		    return sum + Integer.parseInt(tempSum); // convert tempSum to Integer and add to Sum 
		  }

}
