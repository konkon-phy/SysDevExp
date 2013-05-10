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
	private  MyYear _year;
	public void testConstructer(){
		_year = new MyYear(1212);
		assertEquals(_year, toString());
	}
	

}
