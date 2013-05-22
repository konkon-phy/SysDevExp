import java.io.BufferedReader;
import java.io.StringReader;



/**
 * 
 */

/**
 * @author konkon
 *
 */
public class MyDataReader {
	String str;
	BufferedReader reader = new BufferedReader(new StringReader(str));
	
	//public String readData(String name){
	//	str = name;
	//	reader = str;
	//	StringTokenizer st = new StringTokenizer(name, ":");
	//	while(st.hasMoreTokens()){
	//		String token = st.nextToken();
	//		if(token == name){
	//			token = st.nextToken();	//取得したトークンがnameと一致するならば
	//			return token;			//次のトークンを取得して返す
	//		}else{
	//			token =st.nextToken();
	//		}
	//	}
	//	return null;
	}

	//public String readData(String name) {
	//	StringTokenizer st = new StringTokenizer(name, ":");
	//	String token = st.nextToken();
	//	token = st.nextToken();
	//	return token;
	//}

