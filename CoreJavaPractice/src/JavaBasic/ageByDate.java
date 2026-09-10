package JavaBasic;

import java.time.LocalDate;
import java.time.Period;

public class ageByDate {

	public static void main(String[] args) {
		String dob = "1986-10-19";
	  LocalDate bd = LocalDate.parse(dob);
	  LocalDate cd = LocalDate.now();
	  
	  Period p = Period.between(bd, cd);
	  System.out.println("Age ="+ p.getYears()+"Years" + " " + p.getMonths()+"Months"+ " " + p.getDays()+"Days");

	}

}
