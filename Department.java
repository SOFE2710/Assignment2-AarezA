import java.util.HashSet;
import java.util.Vector;

public class Department {
   private String name; // the name of school Dept of Computing and Info Science
   private String id; // short name for courses SOFE, ELEE, STAT, etc
   private Vector<Course> courseList; // all courses offered by the department
   private Vector<Student> registerList; // all students taking courses in the department.

   
   public Department(String name, String id) {
	      // also initialize the vectors
	   this.name = name;
       this.id = id;
       courseList= new Vector<>();
       registerList = new Vector<>();

	   }

   public String getName() {

      return name;
   }

   public String getId() {

      return id;
   }
   //Method to add course to list
 	public void offerCourse(Course course){
   courseList.add(course);
    }

   public String toString() {
      // returns a string representation of department name, number 
      // of courses offered and number of students registered in the
      // department. Use the format:
      // ECSE: 53 courses, 460 students
      return id+ ": "+ String.valueOf(courseList.size()) + "courses " + String.valueOf(registerList.size()) + "Students";
   }
   //Method that will print courses that are offered using toString() method
   public void printCoursesOffered(){
      for(Course course : courseList){
         course.toString();
      }
   }
   //Method that will print the students in the department using toString()
   public void printStudentByName(){
      for(Student student : registerList){
         student.toString();
      }
   }
   //Method that will return true or false if student is registered
   public boolean isStudentRegistered(Student student){
      return registerList.contains(student);
   }
   public Vector<Student> studentsRegisteredInCourse(int number){
      for(Course course : courseList){
         if(course.getCode().equals(number))
            return course.classList;
      }
      //If no students are registered
      return null;
   }

   //Method to print students in course using Course number
   public void printStudentsRegisteredInCourse(int number){
      //If no students are in the course printing none
      if(studentsRegisteredInCourse(number).isEmpty()){
         System.out.println("None.");
         return;
      }
      for(Student student : studentsRegisteredInCourse(number)){
         System.out.println(student.getId()+", "+ student.getName());

      }
   }

   public Course largestCourse(){
      int max =0;
      Course largeCourse = new Course();
      for(Course course : courseList){
         if(course.classList.size() > max){
            max = course.classList.size();
            largeCourse = course;
         }
      }
      return largeCourse;
   }

}
