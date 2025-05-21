//main

public class PersonTest{

    public static void main(String args[]){
        
        Person p = new Person();
        System.out.println(p);
      //System.out.println(p.toString());
        
        MyDate dob = new MyDate(1, 1, 1990);
        Student s = new Student(1, "Jane", "Doe", dob, "Computer Science");
        System.out.println(s);
        
        
        Instructor i = new Instructor(3, "James", "Doe", dob, "PhD");
        System.out.println(i);
        
        }
}