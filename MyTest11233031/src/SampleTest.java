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
public class SampleTest extends TestCase {
	//テスト対象予定クラスのオブジェクト
	protected Sample sample;
	public void setUp() {
		//テスト対象オブジェクトの生成
		sample = new Sample();
	}
	
	public void testGetHello(){
		//比較用文字列
		String message = "Hello World";
		//同じになっているかチェック
		assertEquals(message, sample.getHello("World"));
	}

}
