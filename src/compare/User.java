package compare;

/**
 * @author: wuke
 * @date : 2017年4月20日 下午9:15:20 
 * Title : User 
 * Description :
 */
public class User {
	private int age;
	private String name;

	public User() {

	}

	public User(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
}
