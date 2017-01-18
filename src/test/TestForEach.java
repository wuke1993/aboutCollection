package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wuke 
 * @date  : 2016年12月22日 下午9:47:49
 * Title  : TestForEach
 * Description : 
 */
public class TestForEach {

	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>();
		for(String str : arrList) {
			System.out.println(str);
		}

	}

}
