package Course;

import java.util.Scanner;

public class CourseProject {
    public static void main(String[] args) {

        // =============teacherCreation============
        TeacherClass teacher1 = new TeacherClass();
        teacher1.setName("Tom");
        teacher1.setSurname("Hanks");
        teacher1.setBranch("Java");
        teacher1.setPhoneNumber("3645376576");
        TeacherClass teacher2 = new TeacherClass("Ahmet", "Can", "Selenium", "7653767476");
        // =============creating teachers object for using TeachersClass ================
        TeachersClass teachers = new TeachersClass();
        teachers.addTeachersToList(teacher1);
        teachers.addTeachersToList(teacher2);
        // ============ course creation ======================
        CourseClass course100 =new CourseClass(100, 800, "QA", "Summer" );
        CourseClass course101 =new CourseClass(101, 900, "Web Developer", "Summer" );
        CourseClass course102 =new CourseClass(103, 1000, "Java Developer", "Summer" );
        CourseClass course103 =new CourseClass(104, 1000, "DevOps", "Summer" );

        // =============creating courses object for using CoursesClass ================
        CoursesClass courses = new CoursesClass();
        courses.courseList.add(course100);
        courses.courseList.add(course101);
        courses.courseList.add(course102);
        courses.courseList.add(course103);
        // ================= begining of the interactive program ==================

        int goToProcess = 1;
        StudentClass student = new StudentClass();

        do{
            System.out.println("");
            System.out.println("================================");
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to world of future "
                    + "\nWhat would you like to do ? "
                    + "\n1-Course informations "
                    + "\n2-List of teachers "
                    + "\n3-List of Our Courses+"
                    + "\n4-Create new student+"
                    + "\n5-Print All Students "
                    + "\n6-Show student information with id "
                    + "\n7-Delete student by id");

            System.out.println("Please enter '0' for Quit");
            goToProcess = scan.nextInt();


            switch (goToProcess){
                case 1 : {
                    printCourseInformation();
                    break;
                }
                case 2 : {
                    teachers.printTeachers();
                    System.out.println("Number of Teachers : " + teachers.numbersOfTeachers());
                    break;
                }
                case 3 : {
                    courses.printCourses();
                    System.out.println("Number of available Courses : " + courses.numbersOfCourse());
                    break;
                }
                case 4 : {
                    student.createNewStudent();
                    break;
                }
                case 5 : {
                    student.printStudents();
                    break;
                }
                case 6 : {
                    student.getStudentInfo();
                    break;
                }
                case 7: {
                    student.removeStudent();
                    break;
                }
            }

        }while (goToProcess!=0);
        System.out.println("Thanks for choosing us");

    }//main

    private static void printCourseInformation() {
        System.out.println("===== Course Information =====");
        System.out.println("Name : " + ConstantData.NAME);
        System.out.println("Web Adress : " + ConstantData.WEB_ADRESS);
        System.out.println("Phone Number :  " + ConstantData.PHONE_NUMBER);
        System.out.println("Adress : " + ConstantData.ADDRESS);
    }

    static {
        System.out.println(" / New World IT System \\ ");
    }

}
