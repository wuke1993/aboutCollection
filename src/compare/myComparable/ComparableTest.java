package compare.myComparable;

import java.util.Arrays;

/**
 * @author: wuke 
 * @date  : 2017��4��9�� ����1:54:47
 * Title  : ComparableTest
 * Description : 
 */
public class ComparableTest {

	public static void main(String[] args) {
		Student[] students = new Student[4];
		
		students[0] = new Student(11, "a");
		students[1] = new Student(12, "e");
		students[2] = new Student(13, "c");
		students[3] = new Student(14, "b");
		
		// ͨ�� Student �ڲ��� compareTo() �����Ƚ�����
		Arrays.sort(students);
		
		for(Student stu : students)
		    System.out.println(stu);
	}

}
