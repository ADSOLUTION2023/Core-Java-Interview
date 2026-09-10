package JavaBasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender30 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		for(int i =1;i<=12;i++) {
			/*
			 * c.add(Calendar.DATE, 30);
			 * 
			 * SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
			 * 
			 * System.out.println(sdf.format(c.getTime()));
			 */
			
			int days = c.getActualMaximum(Calendar.DATE);
			String month = new java.text.SimpleDateFormat("MMMM").format(c.getTime());
			c.add(Calendar.MONTH, 1);
			System.out.println(month + "=" + days + "Days");
			
	}
}
}