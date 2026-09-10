package JavaBasic;

import java.util.Calendar;

public class Age {
	 public static void main(String[] args) {

	        Calendar c = Calendar.getInstance();

	        int currentYear = c.get(Calendar.YEAR);

	        int birthYear = 2000;

	        int age = currentYear - birthYear;

	        System.out.println("Age = " + age);
	    }

}
