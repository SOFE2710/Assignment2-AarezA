public class Person {
   private String name;
   
   
   public Person(String initialName)
   {
      
   }
   
   public Person()
   {
     
   }
   //setter for name
   public void setName( String fullName) {
      name = fullName;
    }
   //getter for name
   public String getName() {
      return null;
   }
   //method to return value of name
   public String toString() {
   return name;
   }
   //Method to pass in type course object to register for course in TestApp.java
   public void registerFor(Course course){

   }
   //Method to check if user is in course
   public boolean isRegisterdInCourse(Course course){

      return false;
   }

}
