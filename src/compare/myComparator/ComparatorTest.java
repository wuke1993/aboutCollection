package compare.myComparator;

import java.util.Arrays;

import compare.myComparable.Student;

/**
 * @author: wuke 
 * @date  : 2017年4月9日 下午2:44:59
 * Title  : ComparatorTest
 * Description : 
 */
public class ComparatorTest {

	public static void main(String[] args) {
        Student[] students = new Student[4];
		
		students[0] = new Student(11, "a");
		students[1] = new Student(12, "e");
		students[2] = new Student(13, "c");
		students[3] = new Student(14, "b");
		
		for(Student stu : students)
		    System.out.println(stu);
		
		// Arrays.sort(students, new StudentSortWithName()); // ???
		// Arrays.sort(students);
		
		for(Student stu : students)
		    System.out.println(stu);
	}

}
