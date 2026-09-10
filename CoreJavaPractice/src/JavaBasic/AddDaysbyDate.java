package JavaBasic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddDaysbyDate {
	public static void main(String[] args) {
		String dob = "12/15/2003";
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		
		LocalDateTime nd = LocalDateTime.parse(dob, f);
		LocalDateTime cd = nd.plusDays(30);
		
		System.out.println(cd);
				}

}
