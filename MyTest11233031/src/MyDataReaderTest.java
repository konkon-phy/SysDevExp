 import junit.framework.TestCase;


public class MyDataReaderTest extends TestCase {
	public void testIsValue(){
		MyDataReader reader = new MyDataReader("test:value");
		assertEquals("value", reader.readData("test"));
	}
	
	public void testIsNull(){
		MyDataReader reader = new MyDataReader("");
		assertEquals(null, reader.readData(""));
	}
}