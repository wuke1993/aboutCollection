package compare.myComparator;

import java.util.Comparator;

import compare.myComparable.Student;

/**
 * @author: wuke 
 * @date  : 2017年4月9日 下午2:41:02
 * Title  : StudentSortWithAge
 * Description : 为什么必须显式的导入 Student 类才可以，不导入就会报类型不匹配
 */
public class StudentSortWithAge implements Comparator<Student>{	
	@Override
	public int compare(Student stu1, Student stu2) {
		if(stu1.getAge() > stu2.getAge())
			return 1;
		else if(stu1.getAge() < stu2.getAge())
			return -1;
		else
			return 0;
	}
}
