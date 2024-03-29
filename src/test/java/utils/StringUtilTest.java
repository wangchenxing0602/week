package utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testToHtml() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsPhoneNumber() {
		String str="13812345678";
		boolean b = StringUtil.isPhoneNumber(str);
		System.out.println(b);
	}

	@Test
	public void testIsEmail() {
		String str="2094229451qq.com";
		boolean b = StringUtil.isEmail(str);
		System.out.println(b);
	}

	@Test
	public void testHasLength() {
	}

	@Test
	public void testHasText() {
	}

	@Test
	public void testRandomChineseString() {
	 for(int i=0;i<10;i++) {
		 String string = StringUtil.randomChineseString();
		 System.out.print(string+" ");
	 }
	}

	
	@Test
	public void testRandomChineseString2() {
		 for(int i=0;i<10;i++) {
			 String string = StringUtil.randomSimpleChinese();
			 System.out.print(string+" ");
		 }
		
	}
	@Test
	public void testRandomChineseStringInt() {
		String string = StringUtil.randomChineseString(10);
		System.out.println(string);
		
		
	}

	@Test
	public void testGenerateChineseName() {
		 for(int i=0;i<10;i++) {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
		 }
	}

	
	
	@Test
	public void genderatePerson() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		
		for(int i =0;i<10000;i++) {
			Person person = new Person(StringUtil.generateChineseName(),RandomUtil.random(1, 120),
					StringUtil.randomChineseString(140),DateUtil.randomDate(c.getTime(), new Date()));
			System.out.println(person);
		}
		
		
	}

}
