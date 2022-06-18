package Dean;

import Student.Student;

import java.util.Comparator;

public class SortBySecondName implements Comparator {
/*    @Override
    public int compare(Student a, Student b){
        return a.SecondName.compareTo(b.SecondName);
    }*/

    @Override
    public int compare(Object o1, Object o2) {
        Student st1 = (Student) o1;
        Student st2 = (Student) o2;
        return st1.SecondName.compareTo(st2.SecondName);
    }
}
