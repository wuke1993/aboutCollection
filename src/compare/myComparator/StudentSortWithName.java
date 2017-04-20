package compare.myComparator;

import java.util.Comparator;

import compare.myComparable.Student;

/**
 * @author: wuke 
 * @date  : 2017年4月9日 下午2:25:33
 * Title  : StudentSortWithName
 * Description : 为什么必须显式的导入 Student 类才可以，不导入就会报类型不匹配
 */
public class StudentSortWithName implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		return stu1.getName().compareTo(stu2.getName());
	}

}
