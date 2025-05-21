public class Student extends Person{

private String major;

public Student(){
    super();
    major = "";
    }   

public Student(int id, String fn, String ln, MyDate dob, String major){
    super(id, fn, ln, dob);
    this.major = major;
    }

public String getMajor(){
    return major;
    }

public void setMajor(String major){
    this.major = major;
    }

public String toString(){
    return super.toString() + "\nMajor: " + major;
    }

}