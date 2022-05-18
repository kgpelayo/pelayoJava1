import java.util.*;

public class movie extends person {
  //adds on to original person.java

  private String title;
  private String synopsis;
  private String mpaa_rating;
  private String genres;
  //creates new person objects
  private person actor = new person();
  private person director = new person();
  
  //set 
  public void setTitle(String title){
    this.title = title;
  }
  public void setSynopsis(String synopsis){
    this.synopsis = synopsis;
  }
  public void setmpaa(String mpaa){
    this.mpaa_rating = mpaa;
  }
  public void setGenres(String genres){
    this.genres = genres;
  }
  public void setActors(String fname, String lname){
    this.actor.setfname(fname);
    this.actor.setlname(lname);
  }
  public void setDirectors(String fname, String lname){
    this.director.setfname(fname);
    this.director.setlname(lname);
  }
  
  //get
  public String getTitle(){
    return title;
  }
  public String getSynopsis(){
    return synopsis;
  }
  public String getmpaa(){
    return mpaa_rating;
  }
  public String getGenres(){
    return genres;
  }
  
  //method
  public void printMovie(){
    System.out.println("\n-----  Movie Details  -----\n");
    System.out.println("Movie Title: " + title);
    System.out.println("Synopsis: " + synopsis);
    System.out.println("MPAA Rating: " + mpaa_rating);
    System.out.println("Genre/s: " + genres);
    System.out.println("Director: "+ director.getfname() + " " + director.getlname());
    System.out.print("Actor: " + actor.getfname() + " " + actor.getlname());
  }
}

