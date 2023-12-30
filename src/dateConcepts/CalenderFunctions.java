package dateConcepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderFunctions {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyy hh:mm:ss z");
		System.out.println(sfd.format(cl.getTime()));
		System.out.println(cl.get(Calendar.DATE));
		System.out.println(cl.get(Calendar.DAY_OF_MONTH));
		System.out.println(cl.get(Calendar.DAY_OF_WEEK));
		System.out.println(cl.get(Calendar.MINUTE));
	}
}
