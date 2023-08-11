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
		System.out.println("Total sum of digit= "+sum);
		getSum();
	}
	
	public static void getSum() {
		String s="Selenium45Automation78java56";
        int total=0;
        for(String NumStr:s.split("[^0-9]")){
        	//System.out.println(NumStr);
            if(!NumStr.isEmpty()){
                total += Integer.parseInt(NumStr);
            }
        }
        System.out.println("Total:"+total);
	}

}
