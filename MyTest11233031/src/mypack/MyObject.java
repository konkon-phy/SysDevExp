/*-------------------------------------------
 * 佐賀大学知能情報システム学科
 *   システム開発実験 第2回 演習課題 その2
 * 作成者:11233031 小柳 孝允
 * 作成日:2013/04/18
 * 説明:
 * ------------------------------------------*/
package mypack;

/**
 * @author 11233031
 *
 */
public class MyObject {
	private String _name;
	private int _value;
	
	public MyObject(String name, int value){
		_name = name;
		_value = value;
	}
	
	public String toString(){
		return "name:" + _name + " value:" + _value;
	}
	

}
