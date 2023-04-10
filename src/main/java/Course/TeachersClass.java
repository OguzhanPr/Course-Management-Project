package Course;

import java.util.ArrayList;
import java.util.List;

public class TeachersClass {
     //3
     //there should be a list to store all teachers      1=> List
	 //                i)   method to add teachers to teachers list => method1()
	 //                ii)  method to print all teachers            => method2
	 //                iii) method to print numbers of teachers     => method3

    // <This should be from TeacherClass>
    List<TeacherClass> teachersList = new ArrayList<>();

    //Method1 to add teachers to teachers list
    public void addTeachersToList(TeacherClass teacher){ //given Data from Teachers Class=> add to List
        teachersList.add(teacher);
    }

    //Method2 to print all teachers
    public void printTeachers(){
        System.out.println("==== Teachers list from teachers class ====");
        for (TeacherClass w : teachersList) {
            System.out.println(w.toString(w));  //==> this method from TeacherClass toString(Teachers teacher)
        }
    }

    //Method3 to print numbers of teachers
    public int numbersOfTeachers(){
        return teachersList.size();
    }

}
