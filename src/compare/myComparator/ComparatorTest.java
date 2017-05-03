package compare.myComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import compare.myComparable.Student;

/**
 * @author: wuke 
 * @date  : 2017年4月9日 下午2:44:59
 * Title  : ComparatorTest
 * Description : 
 */
public class ComparatorTest {
	public static void main(String[] args) {
        Student[] students = new Student[3];
		students[0] = new Student(11, "a");
		students[1] = new Student(12, "e");
		students[2] = new Student(10, "c");
		
		Arrays.sort(students, new StudentSortWithAge());
		// Arrays.sort(students); // Student 没有实现 Comparable 接口，为什么可以比较？
		for(Student stu : students)
		    System.out.println(stu);
		
		System.out.println("*********");
		
		List<Student> stus = new ArrayList<Student>();
		stus.add(new Student(11, "a"));
		stus.add(new Student(12, "e"));
		stus.add(new Student(10, "c"));
		
		Collections.sort(stus, new StudentSortWithName());
		for(Student stu : stus)
		    System.out.println(stu);
	}
}
