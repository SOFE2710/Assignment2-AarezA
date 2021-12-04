import java.util.Vector;

public class Student extends Person{
  private String id;
  private String name;
  private Vector courses; // contains all courses the student is registered in


	public Student(String stdName, String stdId) { 
	   this.name = stdName;
	   this.id = stdId;
	   courses = new Vector<>();
	}


  	  public String getName() {  		 
		return name;
  	  }

  	  public String getId() {
		return id;
  	  } 	  
  	  
  	  public boolean isRegisteredInCourse(Course course){
		return courses.contains(course);
	  }

	  public void registerFor(Course course){
		if(!courses.contains(course)){
			courses.add(course);
			course.classList.add(this);
			course.getDept().registerList.add(this);
		}
	  }

    public String toString() {
     // return a string representation of a student using the following format:
     // 100234546 John McDonald
     // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
		StringBuilder sb = new StringBuilder(id).append(" ").append(name).append("\nRegistered courses: ");
		for (Course course : courses) {
			sb.append(", ");
			sb.append(course.getCode()).append(" ").append(course.getTitle());
		}
		return sb.toString();
  }
}
