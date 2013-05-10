/*-------------------------------------------
 * 佐賀大学知能情報システム学科
 *   システム開発実験 第2回 演習課題 その2
 * 作成者:11233031 小柳 孝允
 * 作成日:2013/04/18
 * 説明:
 * ------------------------------------------*/
package mypack;
import java.util.Vector;

/**
 * スタック用クラス
 * @author 11233031
 * @see MyObject
 */
public class MyStack {
	private java.util.Vector<MyObject> _container;
	
	/**
	 * @param size
	 */
	public MyStack(int size){
		/**
		 * @see MyObject
		 */
		_container = new Vector<MyObject>(size);
	}
	/**
	 * @return null
	 * @return ret
	 * @see MyObject
	 */
	public MyObject pop(){
		if(_container.isEmpty()) return null;
		MyObject ret = _container.lastElement();
		_container.remove(_container.size()-1);
		return ret;
	}
	/**
	 * @param obj
	 * @see MyObject
	 */
	public void push(MyObject obj){
		_container.add(obj);
	}
}