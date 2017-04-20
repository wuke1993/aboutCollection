package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: wuke 
 * @date  : 2017年4月20日 下午9:15:53
 * Title  : UserComparator
 * Description : 这个就不用导入 User
 */
public class UserComparator implements Comparator<User>{
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		
        users.add(new User(10, "a"));
        users.add(new User(11, "d"));
        users.add(new User(15, "s"));
        users.add(new User(6, "x"));
        users.add(new User(17, "a"));
        users.add(new User(17, "b"));
        users.add(new User(17, "c"));
        users.add(new User(17," d"));
        
        Collections.sort(users, new UserComparator());
	}
	
	@Override
	public int compare(User u1, User u2) {
        if (u1.getAge() == u2.getAge())
            return 0;
        else if (u1.getAge() > u2.getAge())
            return 1;
        else 
            return -1;
    }
}
