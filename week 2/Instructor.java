public class Instructor extends Person {
    private String degree;

public Instructor(){
    super();
    degree = "";
}

public Instructor(int id, String fn, String ln, MyDate dob, String degree){
    super(id, fn, ln, dob);
    this.degree = degree;
    }

public String getDegree(){
    return degree;
}

public void setDegree(String degree){
    this.degree = degree;   
    }

public String toString(){
    return super.toString() + "\nDegree: " + degree;
    }
    
}