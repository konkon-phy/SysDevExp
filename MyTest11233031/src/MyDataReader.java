import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

/**
 * @author 11233031
 *
 */
public class MyDataReader {
	private String _str;
	public MyDataReader(String str){
	_str = str;
	}
	String readData(String name){
		if(_str != null){
			BufferedReader br = new BufferedReader(new StringReader(_str));
			try {
				while(br.readLine() != null){
					StringTokenizer st = new StringTokenizer(br.readLine(), ":");
					while(st.hasMoreTokens() == true){
						if(st.nextToken() == name){
							String value = st.nextToken();
							return value;
						}
					}
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	return null;
	}
}