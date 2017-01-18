package test;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author: wuke 
 * @date  : 2016年12月14日 下午7:26:17
 * Title  : TestTreeSet
 * Description : 
 */
public class TestTreeSet {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		ArrayList<String> arrayList = new ArrayList<String>() {
			{
				add("bc");add("aa");add("zz");
			}
		};
		
		set.add("aa");
		
		set.add("aa");
		
		set.add("bb");
		
		set.add("ab");
		
		set.addAll(arrayList);
		
		for(String str : arrayList) {
			System.out.println(str);
		}
		
		arrayList.clear();
		arrayList.addAll(set);
		
		for(String str : arrayList) {
			System.out.println(str);
		}
	}

}
