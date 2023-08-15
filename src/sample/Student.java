package sample;

public class Student {
    private String firstName, lastName, classStudent;
    private int age;

   public int getAge(){
       return age;
   }

   public String getFirstName(){
       return firstName;
   }

   public String getLastName(){
       return lastName;
   }

   public String getClassStudent(){
       return classStudent;
   }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName){
       this.firstName = firstName;
    }

    public void setLastName(String lastName){
       this.lastName = lastName;
    }

    public void setClassStudent(String classStudent){
       this.classStudent = classStudent;
    }

}
