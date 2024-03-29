package utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/*
	* 方法1：(5分)    返回传入日期的月初
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	
	public static Date getByInitMonth(Date da) {
		//获取日历类
		Calendar c = Calendar.getInstance();
		//根据传入日期构建日历类
		c.setTime(da);
		c.set(Calendar.DAY_OF_MONTH,1);
		c.set(Calendar.HOUR_OF_DAY,0);
		c.set(Calendar.MINUTE,0);
		c.set(Calendar.SECOND,0);
		
		return c.getTime();
		
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src) {
		Calendar c = Calendar.getInstance();
		c.setTime(src);
	    //让月份+1
		c.add(Calendar.MONTH,1);
		Date date = getByInitMonth(c.getTime());
		c.setTime(date);
		c.add(Calendar.SECOND,-1);
		return c.getTime();
		
	}
	public static Date randomDate(Date minDate ,Date maxDate) {
		//从1970年到minDate的毫米数
		long l1 = minDate.getTime();
		//从1970年到maxDate的毫米数
		long l2 = maxDate.getTime();
		
		Calendar c = Calendar.getInstance();
		
	//	
		long l3 = (long) (Math.random() * (l2-l1 +1 )+l1);
		c.setTimeInMillis(l3);
		
		return c.getTime();
		
		
	}

	
	
}
