package practice1;

public class CountAndSumInt {
	
	public static void main(String[] args) {
	 String s = "amit123";
	 int count = 0;
	 int sum = 0;
	 
	 for(int i =0;i<s.length();i++) {
		 char [] ch = s.toCharArray();
		 if(Character.isDigit(s.charAt(i))) {
			 count++;
			 sum = sum + Character.getNumericValue(s.charAt(i));
		 }
	 }
	 System.out.println(count);
	 System.out.println(sum);
		
	}

}
