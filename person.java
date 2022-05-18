import java.util.*;

public class person{
  
  private String fname;
  private String lname;
  private String gender;
  
  public person(){}
  
  //set
  public void setfname(String fname){
    this.fname = fname;
  }
  public void setlname(String lname){
    this.lname = lname;
  }
  public void setgender(String gender){
    this.gender = gender;
  }
  
  //get
  public String getfname(){
    return fname;
  }
  public String getlname(){
    return lname;
  }
  public String getgender(){
    return gender;
  }
  
  //methods
  public void printName(){
    System.out.print(fname + " " + lname);
  }
  public void printPerson(){
    System.out.println("First Name: " + fname);
    System.out.println("Last Name: " + lname);
    System.out.println("Gender: " + gender);
  }

}
