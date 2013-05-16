/*-------------------------------------------
 * 佐賀大学知能情報システム学科
 *   システム開発実験 第  回 演習課題 その
 * 作成者:11233031 小柳 孝允
 * 作成日:2013/05/16
 * 説明:
 * ------------------------------------------*/

/**
 * @author 11233031
 *
 */
public class MyYear {
	private int _year;

	/**
	 * @param year
	 */
	public MyYear(int year) {
		_year = year;
	}
	public String toString(){
		return Integer.toString(_year);
	}
	/**
	 * @return
	 */
	public boolean isLeap() {
		if(_year % 4 != 0) return false;
		else if(_year % 100 != 0) return true;
		else if(_year % 400 != 0) return false;
		else return true; 
	}

}
