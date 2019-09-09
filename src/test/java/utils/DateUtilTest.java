package utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetByInitMonth() {
	 Calendar c = Calendar.getInstance();
	 c.set(2001,10,10);
	 Date date = DateUtil.getByInitMonth(c.getTime());
	 SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 String string =df.format(date);
	 System.out.println(string);
	}

	@Test
	public void testGetDateFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2008, 2, 22);
		
		Date date = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = df.format(date);
		
		System.out.println(string);
	}

}
