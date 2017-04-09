package compare.myComparator;

import java.util.Comparator;

/**
 * @author: wuke 
 * @date  : 2017��4��9�� ����2:25:33
 * Title  : StudentSortWithName
 * Description : 
 */
public class StudentSortWithName implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		return stu1.getName().compareTo(stu2.getName());
	}

}
