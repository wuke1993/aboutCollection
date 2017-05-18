import java.util.ArrayList;
import java.util.List;

/**
 * @author: wuke 
 * @date  : 2016年12月22日 下午9:47:49
 * Title  : TestForEach
 * Description : Test ForEach
 */
public class TestForEach {

	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>();
		
		arrList.add("aa");
		arrList.add("bb");
		
		for(String str : arrList) {
			System.out.println(str);
		}
		
		System.out.println(arrList);
	}
}