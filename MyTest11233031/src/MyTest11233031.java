/*-------------------------------------------
 * 佐賀大学知能情報システム学科
 *   システム開発実験 第2回 演習課題 その1
 * 作成者:11233031 小柳 孝允
 * 作成日:2013/04/18
 * 説明:
 * ------------------------------------------*/

/**
 * @author 11233031
 *
 */

import mypack.MyObject;
import mypack.MyStack;

public class MyTest11233031 {
	public static void main(String args[]){
		System.out.println("Hello Takayuki KOYANAGI");
		
		int number = 31;
		MyObject obj[] = {
				new MyObject("No1", number),
				new MyObject("No2", number+10),
				new MyObject("No3", number+20)
		};
		
		MyStack stack = new MyStack(3);
		for(int i=0;i<3;i++){
			stack.push(obj[i]);
		}
		
		MyObject mo = stack.pop();
		while(mo != null){
			System.out.println(mo);
			mo = stack.pop();
		}
	}
}
