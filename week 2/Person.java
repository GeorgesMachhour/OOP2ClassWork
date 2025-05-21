public class Person{

    private int id;
    private String fn;
    private String ln;
    private MyDate dob;

    public Person(){
        id = 0;
        fn = "";
        ln = "";
        //dob=null;
        dob = new MyDate();
        }    
public Person(int id, String fn, String ln, MyDate dob){
    this.id = id;
    this.fn = fn;
    this.ln = ln;
    this.dob = dob;
    }

//Getters and setters:
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getFn() {
    return fn;
}

public void setFn(String fn) {
    this.fn = fn;
}

public String getLn() {
    return ln;
}

public void setLn(String ln) {
    this.ln = ln;
}

public MyDate getDob() {
    return dob;
}

public void setDob(MyDate dob) {
    this.dob = dob;
}

public String toString(){
    return "ID: " + id + "\nFirst Name: " + fn + "\nLast Name: " + ln + "\nDate of Birth: " + dob;
    }

}