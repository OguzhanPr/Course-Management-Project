package Course;

public class CourseClass {
    // 4
    // there should be course id, season, name, cost variables
    // there should be constructors to create course objects
    // there should be a method for printing course information=>

    private int courseId;
    private int costOfCourse;
    private String courseName;
    private String courseSeason;

    //constructor
    public  CourseClass(){
    }

    //constructor
    public CourseClass(int courseId, int costOfCourse, String courseName, String courseSeason) {
        this.courseId = courseId;
        this.costOfCourse = costOfCourse;
        this.courseName = courseName;
        this.courseSeason = courseSeason;
    }

    //method for printing course information
    public String toString(CourseClass course){
        return "Course Id : " + courseId + "\n"
                +"Cost of Course : " + costOfCourse + "\n"
                +"Course Name : " + courseName+ "\n"
                +"Course Season: " + courseSeason + "\n"
                + " "  ;

    }

}
