public class MyDate{

private int day;
private int month;
private int year;

public MyDate(){
    day = 0;
    month = 0;
    year = 0;
    }//default constructor

public MyDate(int day, int m, int y){
    this.day = day;
    this.month = m;
    this.year = y;
    }//parameterized constructor
    
public getDay(){
    return day;
    }

public setDay(int d){
    this.day = d;
    }
public getMonth(){
    return month;
    }

public setMonth(int m){
    this.month = m;
    }

public getYear(){    
    return year;
    }

public setYear(int y){
    this.year = y;
    }

public String toString(){
    return day + "/" + month + "/" + year;
    }

}