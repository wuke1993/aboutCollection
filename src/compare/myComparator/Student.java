package compare.myComparator;
/**
 * @author: wuke 
 * @date  : 2017年4月9日 下午2:21:25
 * Title  : Student
 * Description : 
 */
public class Student {
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + "\t" + name;
	}
	
}
