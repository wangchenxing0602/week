package utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testReadTextFileInputStream() {
		try {
			String string = StreamUtil.readTextFile(new FileInputStream("D:/test.txt"));
			System.out.println(string);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Test
	public void testReadTextFileFile() {
	  String string = StreamUtil.readTextFile(new File("D:/test.txt"));
	  System.out.println(string);
	}

}
