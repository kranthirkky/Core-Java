package dateConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunctions {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyy z");
		System.out.println(sfd.format(date));
	}

}
