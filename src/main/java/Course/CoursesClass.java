package Course;

import java.util.ArrayList;
import java.util.List;

public class CoursesClass {
    //5
    //there should be a list to store all courses
    //1-method to add courses to courses list
    //2-method to print all courses
    //3-method to print numbers of courses

    //List to all courses
    List<CourseClass> courseList = new ArrayList<>();

    //method1
    public void addCourse(CourseClass course){
        courseList.add(course);
    }

    //method2
    public void printCourses(){
        System.out.println("==== Courses List From CoursesClass ====");
        for (CourseClass w: courseList) {
            System.out.println(w.toString(w));
        }
    }

    //Method3 to print numbers of courses
    public int numbersOfCourse(){
        return courseList.size();
    }


}
