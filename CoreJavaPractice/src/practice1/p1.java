package practice1;

public class p1 {
	public static void main(String[] args) {
		String s = "amit chandsarkar";
		int count = 0;
		
		for(char a = 'a'; a<='z';a++){
			for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==a) {
				count++;
			}
			
		}
			if(count!=0) {
			System.out.println(a + ":" +count);
			count =0;
	}
	}
}
}

