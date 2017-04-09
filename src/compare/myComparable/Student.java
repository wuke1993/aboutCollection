package compare.myComparable;

/**
 * @author: wuke 
 * @date  : 2017年4月9日 下午1:40:07
 * Title  : Student
 * Description : 
 */
public class Student implements Comparable<Student> { 
	private int age;
	private String name;
	
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
    public int compareTo(Student stu) { 
		return this.getName().compareTo(stu.getName());
	}
	
	@Override
	public String toString() {
		return age + "\t" + name;
	}

}