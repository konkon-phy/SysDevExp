import junit.framework.TestCase;

/*-------------------------------------------
 * 佐賀大学知能情報システム学科
 *   システム開発実験 第  回 演習課題 その
 * 作成者:11233031 小柳 孝允
 * 作成日:2013/05/09
 * 説明:
 * ------------------------------------------*/

/**
 * @author 11233031
 *
 */
public class MyYearTest extends TestCase {
	
	//テスト対象予定クラスのオブジェクト
	
	public void testConstructer(){
		MyYear year = new MyYear(1212);
		assertEquals("1212", year.toString());
	}
	
	public void testIsLeap(){
		MyYear year = new MyYear(1212);
		assertEquals(true, year.isLeap());
	}
	public void testIsLeap100(){
		MyYear year = new MyYear(1100);
		assertEquals(false, year.isLeap());
	}
	
	public void testIsLeap400(){
		MyYear year = new MyYear(1200);
		assertEquals(true, year.isLeap());
	}
	
	public void testIsLeapNG(){
		MyYear year = new MyYear(1213);
		assertEquals(false, year.isLeap());
	}


}
